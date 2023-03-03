// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.TRUE_CONDITION;
import static com.intellij.lang.parser.GeneratedParserUtilBase._COLLAPSE_;
import static com.intellij.lang.parser.GeneratedParserUtilBase._NONE_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.adapt_builder_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.consumeToken;
import static com.intellij.lang.parser.GeneratedParserUtilBase.consumeTokens;
import static com.intellij.lang.parser.GeneratedParserUtilBase.current_position_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.empty_element_parsed_guard_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.enter_section_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.exit_section_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.nextTokenIs;
import static com.intellij.lang.parser.GeneratedParserUtilBase.recursion_guard_;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.ARITHMETIC_OPERATOR;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.ARROW;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.ASSIGN_EQ;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.CALL_EXPRESSION;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.CLASS;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.CLASS_IDENTIFIER;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.CLASS_NAME;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.CLASS_NAME_STATEMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.CLASS_STATEMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.COLON;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.COMMA;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.COMMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.COMPARISON_OPERATOR;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.CONDITION;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.DOT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.EXPRESSION;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.EXPRESSION_STATEMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.EXTENDS;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.EXTENDS_STATEMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.FALSE;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.FLOAT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.FUNC;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.FUNC_STATEMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.IDENTIFIER;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.IDENTIFIER_TYPE;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.IF;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.IF_STATEMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.INT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.LITERAL;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.NULL;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.NUMBER;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_CMP;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_DIV;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_GT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_GT_EQ;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_LT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_LT_EQ;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_MIN;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_MUL;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_NEG;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.OP_PLUS;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.PAREN_L;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.PAREN_R;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.PASS;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.RETURN;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.RETURN_STATEMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.SEMICOLON;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.STRING;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.TRUE;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.TYPE;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.VAR;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.VAR_STATEMENT;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.VOID;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GdScriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // OP_PLUS | OP_MIN | OP_MUL | OP_DIV
  public static boolean arithmetic_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARITHMETIC_OPERATOR, "<arithmetic operator>");
    r = consumeToken(b, OP_PLUS);
    if (!r) r = consumeToken(b, OP_MIN);
    if (!r) r = consumeToken(b, OP_MUL);
    if (!r) r = consumeToken(b, OP_DIV);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER PAREN_L expression? (COMMA expression)* PAREN_R
  public static boolean call_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, PAREN_L);
    r = r && call_expression_2(b, l + 1);
    r = r && call_expression_3(b, l + 1);
    r = r && consumeToken(b, PAREN_R);
    exit_section_(b, m, CALL_EXPRESSION, r);
    return r;
  }

  // expression?
  private static boolean call_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expression_2")) return false;
    expression(b, l + 1);
    return true;
  }

  // (COMMA expression)*
  private static boolean call_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_expression_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_expression_3", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean call_expression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  public static boolean class_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_identifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && class_identifier_1(b, l + 1);
    exit_section_(b, m, CLASS_IDENTIFIER, r);
    return r;
  }

  // (DOT IDENTIFIER)*
  private static boolean class_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_identifier_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_identifier_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_identifier_1", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean class_identifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_identifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS_NAME class_identifier
  public static boolean class_name_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_statement")) return false;
    if (!nextTokenIs(b, CLASS_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS_NAME);
    r = r && class_identifier(b, l + 1);
    exit_section_(b, m, CLASS_NAME_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS class_identifier COLON
  public static boolean class_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && class_identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, CLASS_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // OP_LT | OP_GT | OP_LT_EQ | OP_GT_EQ | OP_CMP
  public static boolean comparison_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = consumeToken(b, OP_LT);
    if (!r) r = consumeToken(b, OP_GT);
    if (!r) r = consumeToken(b, OP_LT_EQ);
    if (!r) r = consumeToken(b, OP_GT_EQ);
    if (!r) r = consumeToken(b, OP_CMP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_NEG? (literal | IDENTIFIER) (comparison_operator (literal | IDENTIFIER))*
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = condition_0(b, l + 1);
    r = r && condition_1(b, l + 1);
    r = r && condition_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP_NEG?
  private static boolean condition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_0")) return false;
    consumeToken(b, OP_NEG);
    return true;
  }

  // literal | IDENTIFIER
  private static boolean condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // (comparison_operator (literal | IDENTIFIER))*
  private static boolean condition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condition_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condition_2", c)) break;
    }
    return true;
  }

  // comparison_operator (literal | IDENTIFIER)
  private static boolean condition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparison_operator(b, l + 1);
    r = r && condition_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // literal | IDENTIFIER
  private static boolean condition_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_2_0_1")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // (operand | operator)+
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expression_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // operand | operator
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    r = operand(b, l + 1);
    if (!r) r = operator(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXTENDS class_identifier
  public static boolean extends_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_statement")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && class_identifier(b, l + 1);
    exit_section_(b, m, EXTENDS_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER identifier_type?
  static boolean func_def_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_def_arg")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && func_def_arg_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier_type?
  private static boolean func_def_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_def_arg_1")) return false;
    identifier_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FUNC IDENTIFIER PAREN_L (func_def_arg COMMA)* func_def_arg? PAREN_R (ARROW type)? COLON
  public static boolean func_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_statement")) return false;
    if (!nextTokenIs(b, FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNC, IDENTIFIER, PAREN_L);
    r = r && func_statement_3(b, l + 1);
    r = r && func_statement_4(b, l + 1);
    r = r && consumeToken(b, PAREN_R);
    r = r && func_statement_6(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, FUNC_STATEMENT, r);
    return r;
  }

  // (func_def_arg COMMA)*
  private static boolean func_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!func_statement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_statement_3", c)) break;
    }
    return true;
  }

  // func_def_arg COMMA
  private static boolean func_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_def_arg(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // func_def_arg?
  private static boolean func_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_statement_4")) return false;
    func_def_arg(b, l + 1);
    return true;
  }

  // (ARROW type)?
  private static boolean func_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_statement_6")) return false;
    func_statement_6_0(b, l + 1);
    return true;
  }

  // ARROW type
  private static boolean func_statement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_statement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COLON type
  public static boolean identifier_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_type")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, IDENTIFIER_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // IF condition COLON
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | STRING | TRUE | FALSE | NULL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // call_expression
  //     | IDENTIFIER
  //     | literal
  static boolean operand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operand")) return false;
    boolean r;
    r = call_expression(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // arithmetic_operator | comparison_operator
  static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    r = arithmetic_operator(b, l + 1);
    if (!r) r = comparison_operator(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // RETURN expression?
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && return_statement_1(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // statement*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // if_statement
  //     | class_statement
  static boolean scoped_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scoped_statement")) return false;
    if (!nextTokenIs(b, "", CLASS, IF)) return false;
    boolean r;
    r = if_statement(b, l + 1);
    if (!r) r = class_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (scoped_statement COMMENT?) // Scoped statements MAY have LINE_END
  //     | (unscoped_statement COMMENT? (SEMICOLON)*) // Unscoped statements MUST have LINE_END or SEMICOLON
  //     | COMMENT
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_0(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // scoped_statement COMMENT?
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scoped_statement(b, l + 1);
    r = r && statement_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // unscoped_statement COMMENT? (SEMICOLON)*
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unscoped_statement(b, l + 1);
    r = r && statement_1_1(b, l + 1);
    r = r && statement_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1_1")) return false;
    consumeToken(b, COMMENT);
    return true;
  }

  // (SEMICOLON)*
  private static boolean statement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SEMICOLON)) break;
      if (!empty_element_parsed_guard_(b, "statement_1_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // class_identifier | VOID | FLOAT | INT
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = class_identifier(b, l + 1);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, INT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var_statement
  //     | func_statement
  //     | expression_statement
  //     | extends_statement
  //     | class_name_statement
  //     | return_statement
  //     | PASS
  static boolean unscoped_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unscoped_statement")) return false;
    boolean r;
    r = var_statement(b, l + 1);
    if (!r) r = func_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = extends_statement(b, l + 1);
    if (!r) r = class_name_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = consumeToken(b, PASS);
    return r;
  }

  /* ********************************************************** */
  // VAR IDENTIFIER identifier_type? ASSIGN_EQ (IDENTIFIER | literal)
  public static boolean var_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VAR, IDENTIFIER);
    r = r && var_statement_2(b, l + 1);
    r = r && consumeToken(b, ASSIGN_EQ);
    r = r && var_statement_4(b, l + 1);
    exit_section_(b, m, VAR_STATEMENT, r);
    return r;
  }

  // identifier_type?
  private static boolean var_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement_2")) return false;
    identifier_type(b, l + 1);
    return true;
  }

  // IDENTIFIER | literal
  private static boolean var_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement_4")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    return r;
  }

}
