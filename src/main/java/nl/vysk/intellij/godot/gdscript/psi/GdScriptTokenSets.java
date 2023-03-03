package nl.vysk.intellij.godot.gdscript.psi;

import com.intellij.psi.tree.TokenSet;

public class GdScriptTokenSets {
    public static final TokenSet IDENTIFIERS = TokenSet.create(GdScriptElementTypes.IDENTIFIER);
    public static final TokenSet COMMENTS = TokenSet.create(GdScriptElementTypes.COMMENT);
    public static final TokenSet STRINGS = TokenSet.create(GdScriptElementTypes.STRING);
    public static final TokenSet KEYWORDS = TokenSet.create(
            GdScriptElementTypes.VOID,
            GdScriptElementTypes.NULL,
            GdScriptElementTypes.TRUE,
            GdScriptElementTypes.FALSE,
            GdScriptElementTypes.CLASS_NAME,
            GdScriptElementTypes.CLASS,
            GdScriptElementTypes.EXTENDS,
            GdScriptElementTypes.VAR,
            GdScriptElementTypes.FUNC,
            GdScriptElementTypes.PASS,
            GdScriptElementTypes.FLOAT,
            GdScriptElementTypes.INT
    );
    public static final TokenSet OPERATORS = TokenSet.create(
            GdScriptElementTypes.ASSIGN_EQ,
            GdScriptElementTypes.ASSIGN_INFER,
            GdScriptElementTypes.ASSIGN_PLUS,
            GdScriptElementTypes.ASSIGN_MIN,
            GdScriptElementTypes.ASSIGN_MUL,
            GdScriptElementTypes.ASSIGN_DIV,
            GdScriptElementTypes.OP_CMP,
            GdScriptElementTypes.OP_NEG,
            GdScriptElementTypes.OP_GT,
            GdScriptElementTypes.OP_LT,
            GdScriptElementTypes.OP_GT_EQ,
            GdScriptElementTypes.OP_LT_EQ,
            GdScriptElementTypes.OP_PLUS,
            GdScriptElementTypes.OP_MIN,
            GdScriptElementTypes.OP_MUL,
            GdScriptElementTypes.OP_DIV
    );
    public static final TokenSet PARENTHESES = TokenSet.create(
            GdScriptElementTypes.PAREN_L,
            GdScriptElementTypes.PAREN_R
    );
}
