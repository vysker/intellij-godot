package nl.vysk.intellij.godot.gdscript;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class GdScriptColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {
            new AttributesDescriptor("Comment", GdScriptSyntaxHighlighter.COMMENTS[0])
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return GdScriptIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new GdScriptSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "extends Node\n" +
                "class_name MyClass\n" +
                "\n" +
                "class InnerClass:\n" +
                "    pass\n" +
                "\n" +
                "var test_var_with_comment = 1 # test\n" +
                "var some_string = \"hi\"\n" +
                "var a_typed_var: float = 3.14\n" +
                "# some line comment\n" +
                "\n" +
                "\n" +
                "func _ready():\n" +
                "    pass\n" +
                "\n" +
                "\n" +
                "func do_things() -> void:\n" +
                "    if something == true:\n" +
                "        return\n" +
                "    \n" +
                "    do_something(\"yes\")\n" +
                "    do_something_else(1, 2, 3, a)\n" +
                "    call_sans_args() \n" +
                "\n" +
                "\n" +
                "func funk_with_args(a, b: float, c):\n" +
                "    pass\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "GDScript";
    }
}
