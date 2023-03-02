package nl.vysk.intellij.godot.gdscript;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GdScriptTokenType extends IElementType {

    public GdScriptTokenType(@NonNls @NotNull String debugName) {
        super(debugName, GdScriptLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "GdScriptTokenType." + super.toString();
    }
}
