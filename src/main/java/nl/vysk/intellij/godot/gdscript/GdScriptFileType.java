package nl.vysk.intellij.godot.gdscript;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GdScriptFileType extends LanguageFileType {
    public static final GdScriptFileType INSTANCE = new GdScriptFileType();

    protected GdScriptFileType() {
        super(GdScriptLanguage.INSTANCE);
    }

    @Override
    @NotNull
    public String getName() {
        return "GDScript File";
    }

    @Override
    @NotNull
    public String getDescription() {
        return "GDScript language file";
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return "gd";
    }

    @Override
    public Icon getIcon() {
        return GdScriptIcons.FILE;
    }
}
