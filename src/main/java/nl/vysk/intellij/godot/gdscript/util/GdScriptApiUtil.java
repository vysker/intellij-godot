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
        final URI resource = getBuiltInClassesUri();
        Objects.requireNonNull(resource);
        Objects.requireNonNull(resource.getPath());
        final File[] files = new File(resource.getPath()).listFiles();
        Objects.requireNonNull(files);
        return Arrays.stream(files)
                .map(File::getName)
                .map(fileName -> fileName.replaceAll(".xml", ""))
                .collect(Collectors.toList());
    }

    @NotNull
    private static URI getBuiltInClassesUri() {
        if (System.getenv("PROJECT_DIR") != null) {
            // When running the plugin in debug mode, it is not in a jar, so we cannot load resources as such
            return Paths.get(System.getenv("PROJECT_DIR"), "build/resources", BUILT_IN_CLASSES_DIR).toUri();
        }

        try {
            final URL resource = Objects.requireNonNull(GdScriptApiUtil.class.getResource(BUILT_IN_CLASSES_DIR));
            return resource.toURI();
        } catch (URISyntaxException e) {
            throw new RuntimeException(String.format("Godot docs are missing from path '%s'", BUILT_IN_CLASSES_DIR));
        }
    }
}
