package Flyweight_DP;
import java.util.HashMap;


public class TextEditorFactory {
    private static final HashMap<String, TextEditor> textEditors = new HashMap<>();

    public static TextEditor getTextEditor(String font, int fontSize, String color) {
        StringBuilder sb = new StringBuilder();
        sb.append(font);
        sb.append(fontSize);
        sb.append(color);
        String textProperties = sb.toString();
        TextEditor textEditor = textEditors.get(textProperties);

        if (textEditor == null) {
            textEditor = new TextEditor(font, fontSize, color);
            textEditors.put(textProperties, textEditor);
            System.out.printf("Creating a new text editor with the properties: %s, %d, %s%n", font, fontSize, color);
        }
        return textEditor;
    }
}
