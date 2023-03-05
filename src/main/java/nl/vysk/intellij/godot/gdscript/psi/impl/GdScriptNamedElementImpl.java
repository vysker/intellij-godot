package nl.vysk.intellij.godot.gdscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class GdScriptNamedElementImpl extends ASTWrapperPsiElement implements GdScriptNamedElement {
    public GdScriptNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
