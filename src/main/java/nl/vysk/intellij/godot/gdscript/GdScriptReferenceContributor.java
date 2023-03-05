package nl.vysk.intellij.godot.gdscript;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceContributor;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.psi.PsiReferenceRegistrar;
import com.intellij.util.ProcessingContext;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifier;
import org.jetbrains.annotations.NotNull;

public class GdScriptReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(GdScriptIdentifier.class),
                new PsiReferenceProvider() {
                    @Override
                    public PsiReference @NotNull [] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                        return new PsiReference[]{new GdScriptReference(element, element.getTextRange())};
                    }
                });
    }
}
