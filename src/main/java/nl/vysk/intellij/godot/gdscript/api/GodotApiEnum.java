package nl.vysk.intellij.godot.gdscript.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class GodotApiEnum {
    private String name;
    private boolean isBitfield;
    private List<GodotApiEnumSymbol> values;

    public String getName() {
        return name;
    }

    public GodotApiEnum setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isBitfield() {
        return isBitfield;
    }


    @JsonProperty("is_bitfield")
    public GodotApiEnum setBitfield(boolean bitfield) {
        isBitfield = bitfield;
        return this;
    }

    public List<GodotApiEnumSymbol> getValues() {
        return values;
    }

    public GodotApiEnum setValues(List<GodotApiEnumSymbol> values) {
        this.values = values;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotApiEnum that = (GodotApiEnum) o;
        return isBitfield == that.isBitfield && Objects.equals(name, that.name) && Objects.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isBitfield, values);
    }

    @Override
    public String toString() {
        return "GodotApiEnum{" +
                "name='" + name + '\'' +
                ", isBitfield=" + isBitfield +
                '}';
    }
}
