// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes.*;
import nl.vysk.intellij.godot.gdscript.psi.*;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public class GdScriptIdentifierImpl extends GdScriptNamedElementImpl implements GdScriptIdentifier {

  public GdScriptIdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GdScriptVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GdScriptVisitor) accept((GdScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getRefName() {
    return findNotNullChildByType(REF_NAME);
  }

  @Override
  public String getName() {
    return GdScriptPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return GdScriptPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return GdScriptPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return GdScriptPsiImplUtil.getPresentation(this);
  }

  @Override
  public PsiReference getReference() {
    return GdScriptPsiImplUtil.getReference(this);
  }

}
