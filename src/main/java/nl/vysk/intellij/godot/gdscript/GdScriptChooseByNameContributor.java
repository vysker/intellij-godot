package nl.vysk.intellij.godot.gdscript;

import com.intellij.navigation.ChooseByNameContributorEx;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.Processor;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.indexing.FindSymbolParameters;
import com.intellij.util.indexing.IdFilter;
import nl.vysk.intellij.godot.gdscript.psi.GdScriptIdentifier;
import nl.vysk.intellij.godot.gdscript.util.GdScriptUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class GdScriptChooseByNameContributor implements ChooseByNameContributorEx {
    @Override
    public void processNames(@NotNull Processor<? super String> processor,
                             @NotNull GlobalSearchScope scope,
                             @Nullable IdFilter filter) {
        final Project project = Objects.requireNonNull(scope.getProject());
        final List<GdScriptIdentifier> identifiers = GdScriptUtil.findIdentifiers(project);
        final List<String> refNames = ContainerUtil.map(identifiers, GdScriptIdentifier::getName);
        ContainerUtil.process(refNames, processor);
    }

    @Override
    public void processElementsWithName(@NotNull String name,
                                        @NotNull Processor<? super NavigationItem> processor,
                                        @NotNull FindSymbolParameters parameters) {
        final List<NavigationItem> identifiers = ContainerUtil.map(
                GdScriptUtil.findIdentifiers(parameters.getProject(), name),
                identifier -> (NavigationItem) identifier);
        ContainerUtil.process(identifiers, processor);
    }
}
