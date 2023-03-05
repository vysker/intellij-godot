package nl.vysk.intellij.godot.gdscript;

import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.ResolveResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GdScriptReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
    private final String refName;

    public GdScriptReference(PsiElement element, TextRange textRange) {
        super(element, textRange);
        refName = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        final Project project = myElement.getProject();
        return GdScriptUtil.findIdentifiers(project, refName).stream()
                .map(PsiElementResolveResult::new)
                .toArray(ResolveResult[]::new);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        final ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @Override
    public Object @NotNull [] getVariants() {
        final Project project = myElement.getProject();
        return GdScriptUtil.findIdentifiers(project).stream()
                .map(identifier -> LookupElementBuilder.create(identifier)
                        .withIcon(GdScriptIcons.FILE)
                        .withTypeText(identifier.getContainingFile().getName()))
                .toArray();
    }
}
