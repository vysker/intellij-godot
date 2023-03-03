// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifierType;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptLiteral;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptVarStatement;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
