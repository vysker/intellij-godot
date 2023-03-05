package nl.vysk.intellij.godot.gdscript;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifier;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptTokenSets;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GdScriptFindUsagesProvider implements FindUsagesProvider {
    @Override
    public @Nullable WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(new GdScriptLexerAdapter(),
                GdScriptTokenSets.IDENTIFIERS,
                GdScriptTokenSets.COMMENTS,
                GdScriptTokenSets.LITERALS);
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Override
    public @Nullable @NonNls String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @Override
    public @Nls @NotNull String getType(@NotNull PsiElement element) {
        if (element instanceof GdScriptIdentifier) {
            return "GDScript class identifier";
        }
        return "";
    }

    @Override
    public @Nls @NotNull String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof GdScriptIdentifier) {
            return ((GdScriptIdentifier) element).getRefName().getText();
        }
        return "";
    }

    @Override
    public @Nls @NotNull String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof GdScriptIdentifier) {
            return ((GdScriptIdentifier) element).getRefName().getText();
        }
        return "";
    }
}
