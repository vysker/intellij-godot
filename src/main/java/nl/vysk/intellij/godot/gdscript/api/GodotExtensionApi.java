package nl.vysk.intellij.godot.gdscript.api;

import java.util.List;
import java.util.Objects;

public class GodotExtensionApi {
    private List<GodotApiClass> classes;

    public List<GodotApiClass> getClasses() {
        return classes;
    }

    public GodotExtensionApi setClasses(List<GodotApiClass> classes) {
        this.classes = classes;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotExtensionApi that = (GodotExtensionApi) o;
        return Objects.equals(classes, that.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classes);
    }

    @Override
    public String toString() {
        return "GodotExtensionApi{" +
                "classes=" + classes +
                '}';
    }
}
