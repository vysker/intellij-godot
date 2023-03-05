// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.vysk.intellij.godot.gdscript.psi.impl.*;

public interface GdScriptElementTypes {

  IElementType ARITHMETIC_OPERATOR = new GdScriptElementType("ARITHMETIC_OPERATOR");
  IElementType CALL_EXPRESSION = new GdScriptElementType("CALL_EXPRESSION");
  IElementType CLASS_IDENTIFIER = new GdScriptElementType("CLASS_IDENTIFIER");
  IElementType CLASS_NAME_STATEMENT = new GdScriptElementType("CLASS_NAME_STATEMENT");
  IElementType CLASS_STATEMENT = new GdScriptElementType("CLASS_STATEMENT");
  IElementType COMPARISON_OPERATOR = new GdScriptElementType("COMPARISON_OPERATOR");
  IElementType CONDITION = new GdScriptElementType("CONDITION");
  IElementType EXPRESSION = new GdScriptElementType("EXPRESSION");
  IElementType EXPRESSION_STATEMENT = new GdScriptElementType("EXPRESSION_STATEMENT");
  IElementType EXTENDS_STATEMENT = new GdScriptElementType("EXTENDS_STATEMENT");
  IElementType FUNC_STATEMENT = new GdScriptElementType("FUNC_STATEMENT");
  IElementType IDENTIFIER = new GdScriptElementType("IDENTIFIER");
  IElementType IDENTIFIER_TYPE = new GdScriptElementType("IDENTIFIER_TYPE");
  IElementType IF_STATEMENT = new GdScriptElementType("IF_STATEMENT");
  IElementType LITERAL = new GdScriptElementType("LITERAL");
  IElementType RETURN_STATEMENT = new GdScriptElementType("RETURN_STATEMENT");
  IElementType TYPE = new GdScriptElementType("TYPE");
  IElementType VAR_STATEMENT = new GdScriptElementType("VAR_STATEMENT");

  IElementType ARROW = new GdScriptTokenType("->");
  IElementType ASSIGN_DIV = new GdScriptTokenType("/=");
  IElementType ASSIGN_EQ = new GdScriptTokenType("=");
  IElementType ASSIGN_INFER = new GdScriptTokenType(":=");
  IElementType ASSIGN_MIN = new GdScriptTokenType("-=");
  IElementType ASSIGN_MUL = new GdScriptTokenType("*=");
  IElementType ASSIGN_PLUS = new GdScriptTokenType("+=");
  IElementType CLASS = new GdScriptTokenType("class");
  IElementType CLASS_NAME = new GdScriptTokenType("class_name");
  IElementType COLON = new GdScriptTokenType(":");
  IElementType COMMA = new GdScriptTokenType(",");
  IElementType COMMENT = new GdScriptTokenType("COMMENT");
  IElementType CURLY_L = new GdScriptTokenType("{");
  IElementType CURLY_R = new GdScriptTokenType("}");
  IElementType DOT = new GdScriptTokenType(".");
  IElementType EXTENDS = new GdScriptTokenType("extends");
  IElementType FALSE = new GdScriptTokenType("false");
  IElementType FLOAT = new GdScriptTokenType("float");
  IElementType FUNC = new GdScriptTokenType("func");
  IElementType IF = new GdScriptTokenType("if");
  IElementType INT = new GdScriptTokenType("int");
  IElementType NULL = new GdScriptTokenType("null");
  IElementType NUMBER = new GdScriptTokenType("NUMBER");
  IElementType OP_CMP = new GdScriptTokenType("==");
  IElementType OP_DIV = new GdScriptTokenType("/");
  IElementType OP_GT = new GdScriptTokenType(">");
  IElementType OP_GT_EQ = new GdScriptTokenType(">=");
  IElementType OP_LT = new GdScriptTokenType("<");
  IElementType OP_LT_EQ = new GdScriptTokenType("<=");
  IElementType OP_MIN = new GdScriptTokenType("-");
  IElementType OP_MUL = new GdScriptTokenType("*");
  IElementType OP_NEG = new GdScriptTokenType("!");
  IElementType OP_PLUS = new GdScriptTokenType("+");
  IElementType PAREN_L = new GdScriptTokenType("(");
  IElementType PAREN_R = new GdScriptTokenType(")");
  IElementType PASS = new GdScriptTokenType("pass");
  IElementType REF_NAME = new GdScriptTokenType("REF_NAME");
  IElementType RETURN = new GdScriptTokenType("return");
  IElementType SEMICOLON = new GdScriptTokenType(";");
  IElementType STRING = new GdScriptTokenType("STRING");
  IElementType TRUE = new GdScriptTokenType("true");
  IElementType VAR = new GdScriptTokenType("var");
  IElementType VOID = new GdScriptTokenType("void");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARITHMETIC_OPERATOR) {
        return new GdScriptArithmeticOperatorImpl(node);
      }
      else if (type == CALL_EXPRESSION) {
        return new GdScriptCallExpressionImpl(node);
      }
      else if (type == CLASS_IDENTIFIER) {
        return new GdScriptClassIdentifierImpl(node);
      }
      else if (type == CLASS_NAME_STATEMENT) {
        return new GdScriptClassNameStatementImpl(node);
      }
      else if (type == CLASS_STATEMENT) {
        return new GdScriptClassStatementImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new GdScriptComparisonOperatorImpl(node);
      }
      else if (type == CONDITION) {
        return new GdScriptConditionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new GdScriptExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new GdScriptExpressionStatementImpl(node);
      }
      else if (type == EXTENDS_STATEMENT) {
        return new GdScriptExtendsStatementImpl(node);
      }
      else if (type == FUNC_STATEMENT) {
        return new GdScriptFuncStatementImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new GdScriptIdentifierImpl(node);
      }
      else if (type == IDENTIFIER_TYPE) {
        return new GdScriptIdentifierTypeImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new GdScriptIfStatementImpl(node);
      }
      else if (type == LITERAL) {
        return new GdScriptLiteralImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new GdScriptReturnStatementImpl(node);
      }
      else if (type == TYPE) {
        return new GdScriptTypeImpl(node);
      }
      else if (type == VAR_STATEMENT) {
        return new GdScriptVarStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
