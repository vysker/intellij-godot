package nl.vysk.intellij.godot.gdscript.api;

import java.util.Objects;

public class GodotApiMethodArgument {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public GodotApiMethodArgument setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public GodotApiMethodArgument setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotApiMethodArgument that = (GodotApiMethodArgument) o;
        return Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "GodotApiMethodArgument{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
