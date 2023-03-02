package nl.vysk.intellij.godot.gdscript;

import com.intellij.lang.Language;

public class GdScriptLanguage extends Language {
    public static final GdScriptLanguage INSTANCE = new GdScriptLanguage();

    protected GdScriptLanguage() {
        super("GDScript");
    }
}
