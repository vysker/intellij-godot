package nl.vysk.intellij.godot.gdscript;

import com.intellij.psi.PsiElement;
import com.intellij.refactoring.rename.RenamePsiElementProcessor;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifier;
import nl.vysk.intellij.godot.gdscript.psi.impl.GdScriptPsiImplUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class GdScriptRenameIdentifierProcessor extends RenamePsiElementProcessor {
    @Override
    public boolean canProcessElement(@NotNull PsiElement element) {
        return element instanceof GdScriptIdentifier;
    }

    @Override
    public void prepareRenaming(@NotNull PsiElement element, @NotNull String newName, @NotNull Map<PsiElement, String> allRenames) {
        final String oldName = GdScriptPsiImplUtil.getName((GdScriptIdentifier) element);
        // TODO: Scope this in such a way that it only finds the proper identifiers
        GdScriptUtil.findIdentifiers(element.getProject(), oldName)
                .forEach(identifier -> allRenames.put(identifier, newName));
    }
}
