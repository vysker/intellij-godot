package nl.vysk.intellij.godot.gdscript.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class GodotApiClassMethod {
    private String name;
    private boolean isConst;
    private boolean isVararg;
    private boolean isStatic;
    private boolean isVirtual;
    private int hash;
    private GodotApiReturnValue returnValue;
    private List<GodotApiMethodArgument> arguments;

    public String getName() {
        return name;
    }

    public GodotApiClassMethod setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isConst() {
        return isConst;
    }


    @JsonProperty("is_const")
    public GodotApiClassMethod setConst(boolean aConst) {
        isConst = aConst;
        return this;
    }

    public boolean isVararg() {
        return isVararg;
    }


    @JsonProperty("is_vararg")
    public GodotApiClassMethod setVararg(boolean vararg) {
        isVararg = vararg;
        return this;
    }

    public boolean isStatic() {
        return isStatic;
    }


    @JsonProperty("is_static")
    public GodotApiClassMethod setStatic(boolean aStatic) {
        isStatic = aStatic;
        return this;
    }

    public boolean isVirtual() {
        return isVirtual;
    }


    @JsonProperty("is_virtual")
    public GodotApiClassMethod setVirtual(boolean virtual) {
        isVirtual = virtual;
        return this;
    }

    public int getHash() {
        return hash;
    }

    public GodotApiClassMethod setHash(int hash) {
        this.hash = hash;
        return this;
    }

    public GodotApiReturnValue getReturnValue() {
        return returnValue;
    }

    public GodotApiClassMethod setReturnValue(GodotApiReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }

    public List<GodotApiMethodArgument> getArguments() {
        return arguments;
    }

    public GodotApiClassMethod setArguments(List<GodotApiMethodArgument> arguments) {
        this.arguments = arguments;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GodotApiClassMethod that = (GodotApiClassMethod) o;
        return isConst == that.isConst && isVararg == that.isVararg && isStatic == that.isStatic && isVirtual == that.isVirtual && hash == that.hash && Objects.equals(name, that.name) && Objects.equals(returnValue, that.returnValue) && Objects.equals(arguments, that.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isConst, isVararg, isStatic, isVirtual, hash, returnValue, arguments);
    }

    @Override
    public String toString() {
        return "GodotApiClassMethod{" +
                "name='" + name + '\'' +
                ", returnValue=" + returnValue +
                ", arguments=" + arguments +
                ", isConst=" + isConst +
                ", isVararg=" + isVararg +
                ", isStatic=" + isStatic +
                ", isVirtual=" + isVirtual +
                ", hash=" + hash +
                '}';
    }
}
