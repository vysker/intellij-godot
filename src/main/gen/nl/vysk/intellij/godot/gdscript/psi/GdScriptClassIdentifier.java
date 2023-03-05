// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface GdScriptClassIdentifier extends PsiElement {

  @NotNull
  List<GdScriptIdentifier> getIdentifierList();

  PsiReference getOuterClass();

}
