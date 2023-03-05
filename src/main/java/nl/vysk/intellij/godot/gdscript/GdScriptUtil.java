package nl.vysk.intellij.godot.gdscript;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifier;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GdScriptUtil {

    public static List<GdScriptIdentifier> findIdentifiers(Project project) {
        return FileTypeIndex.getFiles(GdScriptFileType.INSTANCE, GlobalSearchScope.allScope(project))
                .stream()
                .map(file -> PsiManager.getInstance(project).findFile(file))
                .filter(Objects::nonNull)
                .map(file -> PsiTreeUtil.findChildrenOfAnyType(file, GdScriptIdentifier.class))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public static List<GdScriptIdentifier> findIdentifiers(Project project, String refName) {
        return findIdentifiers(project).stream()
                .filter(identifier -> identifier.getRefName().textMatches(refName))
                .collect(Collectors.toList());
    }
}
