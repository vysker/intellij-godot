// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.vysk.intellij.godot.gdscript.psi.*;

public class GdScriptExpressionImpl extends ASTWrapperPsiElement implements GdScriptExpression {

  public GdScriptExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GdScriptVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GdScriptVisitor) accept((GdScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GdScriptArithmeticOperator> getArithmeticOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GdScriptArithmeticOperator.class);
  }

  @Override
  @NotNull
  public List<GdScriptCallExpression> getCallExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GdScriptCallExpression.class);
  }

  @Override
  @NotNull
  public List<GdScriptComparisonOperator> getComparisonOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GdScriptComparisonOperator.class);
  }

  @Override
  @NotNull
  public List<GdScriptLiteral> getLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GdScriptLiteral.class);
  }

}
