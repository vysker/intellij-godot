package nl.vysk.intellij.godot.gdscript;

import com.intellij.psi.PsiElement;
import com.intellij.refactoring.rename.RenamePsiElementProcessor;
import com.intellij.refactoring.rename.UnresolvableCollisionUsageInfo;
import com.intellij.usageView.UsageInfo;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifier;
import nl.vysk.intellij.godot.gdscript.psi.impl.GdScriptPsiImplUtil;
import nl.vysk.intellij.godot.gdscript.util.GdScriptApiUtil;
import nl.vysk.intellij.godot.gdscript.util.GdScriptUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class GdScriptRenameIdentifierProcessor extends RenamePsiElementProcessor {
    @Override
    public boolean canProcessElement(@NotNull PsiElement element) {
        return element instanceof GdScriptIdentifier;
    }

    @Override
    public void prepareRenaming(@NotNull PsiElement element,
                                @NotNull String newName,
                                @NotNull Map<PsiElement, String> allRenames) {
        final String oldName = GdScriptPsiImplUtil.getName((GdScriptIdentifier) element);
        // TODO: Scope this in such a way that it only finds the proper identifiers
        GdScriptUtil.findIdentifiers(element.getProject(), oldName)
                .forEach(identifier -> allRenames.put(identifier, newName));
    }

    @Override
    public void findCollisions(@NotNull PsiElement element,
                               @NotNull String newName,
                               @NotNull Map<? extends PsiElement, String> allRenames,
                               @NotNull List<UsageInfo> result) {
        allRenames.forEach((renamedElement, value) -> {
            final String oldName = ((GdScriptIdentifier) element).getName();
            if (GdScriptApiUtil.getGodotBuiltinClassNames().contains(oldName)) {
                result.add(createCollisionUsageInfo(renamedElement, oldName));
            }
        });
    }

    @NotNull
    private static UnresolvableCollisionUsageInfo createCollisionUsageInfo(PsiElement renamedElement, String oldName) {
        return new UnresolvableCollisionUsageInfo(renamedElement, null) {
            @Override
            public String getDescription() {
                return String.format("Cannot rename built-in Godot class ('%s')", oldName);
            }
        };
    }
}
