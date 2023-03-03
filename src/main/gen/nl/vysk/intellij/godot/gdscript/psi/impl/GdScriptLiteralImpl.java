// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptLiteral;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.NUMBER;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.STRING;

public class GdScriptLiteralImpl extends ASTWrapperPsiElement implements GdScriptLiteral {

  public GdScriptLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GdScriptVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GdScriptVisitor) accept((GdScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
