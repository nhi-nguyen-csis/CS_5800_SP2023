package Flyweight_DP;

public class TextEditor implements TextEditable {
    private String text;
    private String font;
    private int fontSize;
    private String color;

    public TextEditor(){};

    public TextEditor(String font, int fontSize, String color) {
        this.font = font;
        this.fontSize = fontSize;
        this.color = color;
    }

    @Override
    public void create(String text) {
        this.text = text;
    }


    @Override
    public void edit(TextEditor textEditor, String newText){
        System.out.printf("Editing the original text '%s' to '%s'%n", textEditor.text, newText);
        textEditor.text = newText;
    }

    @Override
    public void save() {
        System.out.printf("Saving the text '%s' with font %s, " +
                "font size %d, and color %s%n%n", text, font, fontSize, color);
    }
}

