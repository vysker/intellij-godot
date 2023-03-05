// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public interface GdScriptIdentifier extends GdScriptNamedElement {

  @NotNull
  PsiElement getRefName();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

  PsiReference getReference();

}
