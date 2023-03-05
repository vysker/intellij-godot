package nl.vysk.intellij.godot.gdscript.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import nl.vysk.intellij.godot.gdscript.GdScriptFileType;

import java.util.Optional;

public class GdScriptElementFactory {

    public static GdScriptIdentifier createIdentifier(Project project, String name) {
        PsiFileFactory.getInstance(project).createFileFromText("bla.gd", GdScriptFileType.INSTANCE, "");

        final GdScriptFile file = createFile(project, name);
        return Optional.ofNullable(file.findChildByClass(GdScriptExpressionStatement.class))
                .map(GdScriptExpressionStatement::getExpression)
                .map(GdScriptExpression::getIdentifierList)
                .flatMap(identifiers -> identifiers.stream().findFirst())
                .orElseThrow();
    }

    private static GdScriptFile createFile(Project project, String text) {
        return (GdScriptFile) PsiFileFactory.getInstance(project)
                .createFileFromText("dummy.gd", GdScriptFileType.INSTANCE, text);
    }
}
