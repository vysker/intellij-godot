// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptClassIdentifier;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptType;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GdScriptTypeImpl extends ASTWrapperPsiElement implements GdScriptType {

  public GdScriptTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GdScriptVisitor visitor) {
    visitor.visitType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GdScriptVisitor) accept((GdScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GdScriptClassIdentifier getClassIdentifier() {
    return findChildByClass(GdScriptClassIdentifier.class);
  }

}
