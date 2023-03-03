package nl.vysk.intellij.godot.gdscript;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import nl.vysk.intellij.godot.gdscript.parser.GdScriptParser;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptFile;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptTokenSets;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes;
import org.jetbrains.annotations.NotNull;

public class GdScriptParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(GdScriptLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new GdScriptLexerAdapter();
    }

    @NotNull
    @Override
    public PsiParser createParser(Project project) {
        return new GdScriptParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return GdScriptTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return GdScriptTokenSets.STRINGS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return GdScriptElementTypes.Factory.createElement(node);
    }

    @Override
    @NotNull
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new GdScriptFile(viewProvider);
    }
}
