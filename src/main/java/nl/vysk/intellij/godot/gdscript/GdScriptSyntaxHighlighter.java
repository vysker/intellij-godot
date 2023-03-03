package nl.vysk.intellij.godot.gdscript;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptTokenSets;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class GdScriptSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey[] COMMENTS = {
            createTextAttributesKey("GDSCRIPT_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)};
    public static final TextAttributesKey[] KEYWORDS = {
            createTextAttributesKey("GDSCRIPT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)};
    public static final TextAttributesKey[] STRINGS = {
            createTextAttributesKey("GDSCRIPT_STRING", DefaultLanguageHighlighterColors.STRING)};
    public static final TextAttributesKey[] IDENTIFIERS = {
            createTextAttributesKey("GDSCRIPT_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)};
    public static final TextAttributesKey[] FUNCTION_CALL = {
            createTextAttributesKey("GDSCRIPT_FUNCTION_CALL", DefaultLanguageHighlighterColors.FUNCTION_CALL)};
    public static final TextAttributesKey[] SEMICOLON = {
            createTextAttributesKey("GDSCRIPT_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)};
    public static final TextAttributesKey[] COMMA = {
            createTextAttributesKey("GDSCRIPT_COMMA", DefaultLanguageHighlighterColors.COMMA)};
    public static final TextAttributesKey[] DOT = {
            createTextAttributesKey("GDSCRIPT_DOT", DefaultLanguageHighlighterColors.DOT)};
    public static final TextAttributesKey[] OPERATION_SIGN = {
            createTextAttributesKey("GDSCRIPT_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN)};
    public static final TextAttributesKey[] PARENTHESES = {
            createTextAttributesKey("GDSCRIPT_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)};
    public static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new GdScriptLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (GdScriptTokenSets.COMMENTS.contains(tokenType)) return COMMENTS;
        if (GdScriptTokenSets.KEYWORDS.contains(tokenType)) return KEYWORDS;
        if (GdScriptTokenSets.STRINGS.contains(tokenType)) return STRINGS;
        if (GdScriptTokenSets.OPERATORS.contains(tokenType)) return OPERATION_SIGN;
        if (GdScriptTokenSets.IDENTIFIERS.contains(tokenType)) return IDENTIFIERS;
        if (GdScriptTokenSets.PARENTHESES.contains(tokenType)) return PARENTHESES;
        if (GdScriptElementTypes.CALL_EXPRESSION.equals(tokenType)) return FUNCTION_CALL;
        if (GdScriptElementTypes.SEMICOLON.equals(tokenType)) return SEMICOLON;
        if (GdScriptElementTypes.COMMA.equals(tokenType)) return COMMA;
        if (GdScriptElementTypes.DOT.equals(tokenType)) return DOT;
        return EMPTY_KEYS;
    }
}
