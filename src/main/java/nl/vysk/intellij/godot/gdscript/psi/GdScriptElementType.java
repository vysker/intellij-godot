package nl.vysk.intellij.godot.gdscript.psi;

import com.intellij.psi.tree.IElementType;
import nl.vysk.intellij.godot.gdscript.GdScriptLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GdScriptElementType extends IElementType {
    public GdScriptElementType(@NonNls @NotNull String debugName) {
        super(debugName, GdScriptLanguage.INSTANCE);
    }
}
