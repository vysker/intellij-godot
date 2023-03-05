package nl.vysk.intellij.godot.gdscript.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileSystemItem;
import com.intellij.psi.PsiReference;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptClassIdentifier;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptElementFactory;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptElementTypes;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifier;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Optional;

public class GdScriptPsiImplUtil {

    public static PsiElement getNameIdentifier(GdScriptIdentifier identifier) {
        final ASTNode node = identifier.getNode().findChildByType(GdScriptElementTypes.REF_NAME);
        return Optional.ofNullable(node)
                .map(ASTNode::getPsi)
                .orElse(null);
    }

    public static String getName(GdScriptIdentifier identifier) {
        return identifier.getRefName().getText();
    }

    public static PsiElement setName(GdScriptIdentifier identifier, String newName) {
        final ASTNode oldNode = identifier.getNode().findChildByType(GdScriptElementTypes.REF_NAME);
        if (oldNode == null) {
            return identifier;
        }

        final GdScriptIdentifier newIdentifier =
                GdScriptElementFactory.createIdentifier(identifier.getProject(), newName);
        final ASTNode newNode = newIdentifier.getRefName().getNode();
        identifier.getNode().replaceChild(oldNode, newNode);

        return identifier;
    }

    public static PsiReference getReference(GdScriptIdentifier identifier) {
        return identifier.getRefName().getReference();
    }

    public static PsiReference getOuterClass(GdScriptClassIdentifier classIdentifier) {
        return classIdentifier.getFirstChild().getReference();
    }

    public static ItemPresentation getPresentation(GdScriptIdentifier identifier) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return identifier.getRefName().getText();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return Optional.ofNullable(identifier.getContainingFile())
                        .map(PsiFileSystemItem::getName)
                        .orElse(null);
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return identifier.getIcon(0);
            }
        };
    }
}
