package nl.vysk.intellij.godot.gdscript.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.vysk.intellij.godot.gdscript.GdScriptFileType;
import nl.vysk.intellij.godot.gdscript.GdScriptLanguage;
import org.jetbrains.annotations.NotNull;

public class GdScriptFile extends PsiFileBase {
    public GdScriptFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, GdScriptLanguage.INSTANCE);
    }

    @Override
    @NotNull
    public FileType getFileType() {
        return GdScriptFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "GDScript File";
    }
}
