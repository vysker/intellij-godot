package nl.vysk.intellij.godot.gdscript.api;

import java.util.List;
import java.util.Objects;

public class GodotApiSignal {
    private String name;
    private List<GodotApiSignalArgument> arguments;

    public String getName() {
        return name;
    }

    public GodotApiSignal setName(String name) {
        this.name = name;
        return this;
    }

    public List<GodotApiSignalArgument> getArguments() {
        return arguments;
    }

    public GodotApiSignal setArguments(List<GodotApiSignalArgument> arguments) {
        this.arguments = arguments;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotApiSignal that = (GodotApiSignal) o;
        return Objects.equals(name, that.name) && Objects.equals(arguments, that.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, arguments);
    }

    @Override
    public String toString() {
        return "GodotApiSignal{" +
                "name='" + name + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
