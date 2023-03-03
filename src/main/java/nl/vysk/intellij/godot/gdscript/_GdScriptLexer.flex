package nl.vysk.intellij.godot.gdscript;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.*;

%%

%{
  public _GdScriptLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _GdScriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

WHITE_SPACE=[ \t\n\x0B\f\r]+
COMMENT=#.*\n
NUMBER=[0-9]+(\.[0-9]*)?
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "null"             { return NULL; }
  "void"             { return VOID; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }
  "if"               { return IF; }
  "var"              { return VAR; }
  "class"            { return CLASS; }
  "class_name"       { return CLASS_NAME; }
  "extends"          { return EXTENDS; }
  "func"             { return FUNC; }
  "return"           { return RETURN; }
  "pass"             { return PASS; }
  "float"            { return FLOAT; }
  "int"              { return INT; }
  "."                { return DOT; }
  ","                { return COMMA; }
  ":"                { return COLON; }
  ";"                { return SEMICOLON; }
  "->"               { return ARROW; }
  "("                { return PAREN_L; }
  ")"                { return PAREN_R; }
  "{"                { return CURLY_L; }
  "}"                { return CURLY_R; }
  "="                { return ASSIGN_EQ; }
  ":="               { return ASSIGN_INFER; }
  "+="               { return ASSIGN_PLUS; }
  "-="               { return ASSIGN_MIN; }
  "*="               { return ASSIGN_MUL; }
  "/="               { return ASSIGN_DIV; }
  "+"                { return OP_PLUS; }
  "-"                { return OP_MIN; }
  "*"                { return OP_MUL; }
  "/"                { return OP_DIV; }
  "!"                { return OP_NEG; }
  "<"                { return OP_LT; }
  ">"                { return OP_GT; }
  "<="               { return OP_LT_EQ; }
  ">="               { return OP_GT_EQ; }
  "=="               { return OP_CMP; }

  {WHITE_SPACE}      { return WHITE_SPACE; }
  {COMMENT}          { return COMMENT; }
  {NUMBER}           { return NUMBER; }
  {STRING}           { return STRING; }
  {IDENTIFIER}       { return IDENTIFIER; }

}

[^] { return BAD_CHARACTER; }
