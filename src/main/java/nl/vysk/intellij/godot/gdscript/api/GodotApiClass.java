package nl.vysk.intellij.godot.gdscript.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class GodotApiClass {
    private String name;
    private boolean isRefcounted;
    private boolean isInstantiable;
    private String inherits;
    private String apiType;
    private List<GodotApiEnum> enums;
    private List<GodotApiSignal> signals;
    private List<GodotApiProperty> properties;

    public String getName() {
        return name;
    }

    public GodotApiClass setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isRefcounted() {
        return isRefcounted;
    }

    @JsonProperty("is_refcounted")
    public GodotApiClass setRefcounted(boolean refcounted) {
        isRefcounted = refcounted;
        return this;
    }

    public boolean isInstantiable() {
        return isInstantiable;
    }

    @JsonProperty("is_instantiable")
    public GodotApiClass setInstantiable(boolean instantiable) {
        isInstantiable = instantiable;
        return this;
    }

    public String getInherits() {
        return inherits;
    }

    public GodotApiClass setInherits(String inherits) {
        this.inherits = inherits;
        return this;
    }

    public String getApiType() {
        return apiType;
    }

    public GodotApiClass setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }

    public List<GodotApiEnum> getEnums() {
        return enums;
    }

    public GodotApiClass setEnums(List<GodotApiEnum> enums) {
        this.enums = enums;
        return this;
    }

    public List<GodotApiSignal> getSignals() {
        return signals;
    }

    public GodotApiClass setSignals(List<GodotApiSignal> signals) {
        this.signals = signals;
        return this;
    }

    public List<GodotApiProperty> getProperties() {
        return properties;
    }

    public GodotApiClass setProperties(List<GodotApiProperty> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotApiClass that = (GodotApiClass) o;
        return isRefcounted == that.isRefcounted && isInstantiable == that.isInstantiable && Objects.equals(name, that.name) && Objects.equals(inherits, that.inherits) && Objects.equals(apiType, that.apiType) && Objects.equals(enums, that.enums) && Objects.equals(signals, that.signals) && Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isRefcounted, isInstantiable, inherits, apiType, enums, signals, properties);
    }

    @Override
    public String toString() {
        return "GodotApiClass{" +
                "name='" + name + '\'' +
                ", inherits='" + inherits + '\'' +
                ", isRefcounted=" + isRefcounted +
                ", isInstantiable=" + isInstantiable +
                '}';
    }
}
