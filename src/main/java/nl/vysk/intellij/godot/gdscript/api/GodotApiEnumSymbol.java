package nl.vysk.intellij.godot.gdscript.api;

import java.util.Objects;

public class GodotApiEnumSymbol {
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public GodotApiEnumSymbol setName(String name) {
        this.name = name;
        return this;
    }

    public int getValue() {
        return value;
    }

    public GodotApiEnumSymbol setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotApiEnumSymbol that = (GodotApiEnumSymbol) o;
        return value == that.value && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "GodotApiEnumSymbol{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
