package nl.vysk.intellij.godot.gdscript;

import com.intellij.lexer.FlexAdapter;

public class GdScriptLexerAdapter extends FlexAdapter {
    public GdScriptLexerAdapter() {
        super(new _GdScriptLexer(null));
    }
}
