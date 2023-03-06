package nl.vysk.intellij.godot.gdscript.api;

import java.util.Objects;

public class GodotApiReturnValue {
    private String type;

    public String getType() {
        return type;
    }

    public GodotApiReturnValue setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotApiReturnValue that = (GodotApiReturnValue) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "GodotApiReturnValue{" +
                "type='" + type + '\'' +
                '}';
    }
}
