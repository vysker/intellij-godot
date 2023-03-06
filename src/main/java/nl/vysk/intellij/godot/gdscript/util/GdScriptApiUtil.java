package nl.vysk.intellij.godot.gdscript.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import nl.vysk.intellij.godot.gdscript.GodotApiTreeNode;
import nl.vysk.intellij.godot.gdscript.api.GodotApiClass;
import nl.vysk.intellij.godot.gdscript.api.GodotExtensionApi;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GdScriptApiUtil {
    private static final String GODOT_EXTENSION_API_JSON_PATH = "/godot-docs/extension_api.json";
    private static final GodotExtensionApi GODOT_EXTENSION_API = getGodotExtensionApi();
    private static final GodotApiTreeNode GODOT_API_TREE = loadApiTree(GODOT_EXTENSION_API);
    private static final List<String> GODOT_BUILTIN_CLASS_NAMES = getBuiltinClassNames(GODOT_EXTENSION_API);

    /**
     * Godot has a bunch of built-in classes, which are basically reserved keywords.
     *
     * @return A list of class names like "Node2D"
     */
    public static List<String> getGodotBuiltinClassNames() {
        return GODOT_BUILTIN_CLASS_NAMES;
    }

    private static GodotApiTreeNode loadApiTree(GodotExtensionApi api) {
        final GodotApiClass object = api.getClasses().stream()
                .filter(c -> c.getName().equals("Object")) // Object is the base class of the Godot API
                .findFirst()
                .orElseThrow(() -> new RuntimeException("There should be an 'Object' class in the Godot Extension API"));
        object.setInherits("None"); // This is a hack so we don't need an additional if-statement when building our tree

        final GodotApiTreeNode tree = new GodotApiTreeNode();
        tree.setApiClass(object);
        buildApiTree(tree, api);
        // TODO: object.setInherits(null) or not?
        return tree;
    }

    private static void buildApiTree(GodotApiTreeNode node, GodotExtensionApi api) {
        final List<GodotApiTreeNode> subclasses = api.getClasses().stream()
                .filter(apiClass -> apiClass.getInherits().equals(node.getApiClass().getName()))
                .map(apiClass -> new GodotApiTreeNode()
                        .setApiClass(apiClass)
                        .setInherits(node))
                .collect(Collectors.toList());
        node.getSubclasses().addAll(subclasses);

        for (GodotApiTreeNode subclass : subclasses) {
            buildApiTree(subclass, api);
        }
    }

    private static List<String> getBuiltinClassNames(GodotExtensionApi api) {
        return api.getClasses().stream()
                .map(GodotApiClass::getName)
                .collect(Collectors.toList());
    }

    private static GodotExtensionApi getGodotExtensionApi() {
        final URI resourceUri = getResourceUri(GODOT_EXTENSION_API_JSON_PATH);
        final ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        try {
            return objectMapper.readValue(resourceUri.toURL(), GodotExtensionApi.class);
        } catch (IOException e) {
            throw new RuntimeException(
                    String.format("Failed to parse '%s', because: %s", GODOT_EXTENSION_API_JSON_PATH, e));
        }
    }

    @NotNull
    private static URI getResourceUri(String resourcePath) {
        if (System.getenv("RESOURCES_DIR") != null) {
            // When running the plugin in debug mode, it is not in a jar, so we cannot load resources as such
            return Paths.get(System.getenv("RESOURCES_DIR"), resourcePath).toUri();
        }

        try {
            final URL resource = Objects.requireNonNull(
                    GdScriptApiUtil.class.getResource(resourcePath),
                    String.format("Failed to find resource at path '%s'", resourcePath));
            return resource.toURI();
        } catch (URISyntaxException e) {
            throw new RuntimeException(String.format("Failed to find resource at path '%s'", resourcePath));
        }
    }
}
