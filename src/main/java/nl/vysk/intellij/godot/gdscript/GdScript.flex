package nl.vysk.intellij.godot.gdscript;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.*;

%%

%class GdScriptLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

WHITE_SPACE=[\ \t\f]+
//WHITESPACE=\s+|\n

COMMENT=#.*\n
NUMBER=\d+(\.\d*)?
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
IDENTIFIER=[\p{Alpha}_][\p{Alnum}_]*

%%
<YYINITIAL> {
    {WHITE_SPACE}       { return TokenType.WHITE_SPACE; }
    "true"              { return TRUE; }
    "false"             { return FALSE; }
    "null"              { return NULL; }
    "if"                { return IF; }
    "var"               { return VAR; }
    "class"             { return CLASS; }
    "class_name"        { return CLASS_NAME; }
    "extends"           { return EXTENDS; }
    "func"              { return FUNC; }
    "return"            { return RETURN; }
    "pass"              { return PASS; }
    "void"              { return VOID; }

    "float"             { return FLOAT; }
    "int"               { return INT; }

    "."                 { return DOT; }
    ","                 { return COMMA; }
    ":"                 { return COLON; }
    ";"                 { return SEMICOLON; }
    "->"                { return ARROW; }
    "("                 { return PAREN_L; }
    ")"                 { return PAREN_R; }
    "{"                 { return CURLY_L; }
    "}"                 { return CURLY_R; }

    "="                 { return ASSIGN_EQ; }
    ":="                { return ASSIGN_INFER; }
    "+="                { return ASSIGN_PLUS; }
    "-="                { return ASSIGN_MIN; }
    "*="                { return ASSIGN_MUL; }
    "/="                { return ASSIGN_DIV; }

    "+"                 { return OP_PLUS; }
    "-"                 { return OP_MIN; }
    "*"                 { return OP_MUL; }
    "/"                 { return OP_DIV; }

    "!"                 { return OP_NEG; }
    "<"                 { return OP_LT; }
    ">"                 { return OP_GT; }
    "<="                { return OP_LT_EQ; }
    ">="                { return OP_GT_EQ; }
    "=="                { return OP_CMP; }

    [\n]                { return EOL; }
    {COMMENT}           { return COMMENT; }
    {NUMBER}            { return NUMBER; }
    {STRING}            { return STRING; }
    {IDENTIFIER}        { return IDENTIFIER; }
}

[^]                     { return TokenType.BAD_CHARACTER; }
