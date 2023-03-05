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

public class GdScriptVarStatementImpl extends ASTWrapperPsiElement implements GdScriptVarStatement {

  public GdScriptVarStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GdScriptVisitor visitor) {
    visitor.visitVarStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GdScriptVisitor) accept((GdScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GdScriptIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GdScriptIdentifier.class);
  }

  @Override
  @Nullable
  public GdScriptIdentifierType getIdentifierType() {
    return findChildByClass(GdScriptIdentifierType.class);
  }

  @Override
  @Nullable
  public GdScriptLiteral getLiteral() {
    return findChildByClass(GdScriptLiteral.class);
  }

}
