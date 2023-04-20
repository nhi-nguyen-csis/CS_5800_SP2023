package Flyweight_DP;

public interface TextEditable {
    void create(String text);
    void edit(TextEditor textEditor, String newText);
    void save();
}
