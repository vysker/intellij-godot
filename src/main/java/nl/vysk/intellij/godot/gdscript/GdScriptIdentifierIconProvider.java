package nl.vysk.intellij.godot.gdscript;

import com.intellij.ide.IconProvider;
import com.intellij.psi.PsiElement;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class GdScriptIdentifierIconProvider extends IconProvider {
    @Nullable
    @Override
    public Icon getIcon(@NotNull PsiElement element, int flags) {
        return element instanceof GdScriptIdentifier ? GdScriptIcons.FILE : null;
    }
}
