package nl.vysk.intellij.godot.gdscript;

import nl.vysk.intellij.godot.gdscript.api.GodotApiClass;

import java.util.ArrayList;
import java.util.List;

public class GodotApiTreeNode {
    private GodotApiClass apiClass;
    private List<GodotApiTreeNode> subclasses;
    private GodotApiTreeNode inherits;

    public GodotApiTreeNode() {
        subclasses = new ArrayList<>();
    }

    public GodotApiClass getApiClass() {
        return apiClass;
    }

    public GodotApiTreeNode setApiClass(GodotApiClass apiClass) {
        this.apiClass = apiClass;
        return this;
    }

    public List<GodotApiTreeNode> getSubclasses() {
        return subclasses;
    }

    public GodotApiTreeNode setSubclasses(List<GodotApiTreeNode> subclasses) {
        this.subclasses = subclasses;
        return this;
    }

    public GodotApiTreeNode getInherits() {
        return inherits;
    }

    public GodotApiTreeNode setInherits(GodotApiTreeNode inherits) {
        this.inherits = inherits;
        return this;
    }

    @Override
    public String toString() {
        return "GodotApiTreeNode{" +
                "clazz=" + apiClass +
                '}';
    }
}
