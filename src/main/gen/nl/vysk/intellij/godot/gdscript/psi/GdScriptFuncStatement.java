// This is a generated file. Not intended for manual editing.
package nl.vysk.intellij.godot.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GdScriptFuncStatement extends PsiElement {

  @NotNull
  List<GdScriptIdentifier> getIdentifierList();

  @NotNull
  List<GdScriptIdentifierType> getIdentifierTypeList();

  @Nullable
  GdScriptType getType();

}
