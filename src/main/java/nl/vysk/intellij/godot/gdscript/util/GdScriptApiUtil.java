package nl.vysk.intellij.godot.gdscript.util;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GdScriptApiUtil {
    private static final String BUILT_IN_CLASSES_DIR = "/godot-docs/doc/classes";
    private static final List<String> BUILT_IN_CLASSES = loadBuiltInClasses();

    /**
     * Godot has a bunch of built-in classes, which are basically reserved keywords.
     *
     * @return A list of class names like "Node2D"
     */
    public static List<String> getBuiltInClasses() {
        return BUILT_IN_CLASSES;
    }

    private static List<String> loadBuiltInClasses() {
        final URI builtInClassDir = getResourceUri(BUILT_IN_CLASSES_DIR);
        Objects.requireNonNull(builtInClassDir);
        Objects.requireNonNull(builtInClassDir.getPath());
        final File[] files = new File(builtInClassDir.getPath()).listFiles();
        Objects.requireNonNull(files);
        return Arrays.stream(files)
                .map(File::getName)
                .map(fileName -> fileName.replaceAll(".xml", ""))
                .collect(Collectors.toList());
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
