package nl.vysk.intellij.godot.gdscript.api;

import java.util.Objects;

public class GodotApiProperty {
    private String type;
    private String name;
    private String setter;
    private String getter;

    public String getType() {
        return type;
    }

    public GodotApiProperty setType(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public GodotApiProperty setName(String name) {
        this.name = name;
        return this;
    }

    public String getSetter() {
        return setter;
    }

    public GodotApiProperty setSetter(String setter) {
        this.setter = setter;
        return this;
    }

    public String getGetter() {
        return getter;
    }

    public GodotApiProperty setGetter(String getter) {
        this.getter = getter;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotApiProperty that = (GodotApiProperty) o;
        return Objects.equals(type, that.type) && Objects.equals(name, that.name) && Objects.equals(setter, that.setter) && Objects.equals(getter, that.getter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, setter, getter);
    }

    @Override
    public String toString() {
        return "GodotApiProperty{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", setter='" + setter + '\'' +
                ", getter='" + getter + '\'' +
                '}';
    }
}
