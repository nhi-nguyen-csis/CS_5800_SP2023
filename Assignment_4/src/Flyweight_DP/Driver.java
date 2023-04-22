package Flyweight_DP;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    private static final String[] fonts = {"Arial", "Times New Roman"};
    private static final int[] fontSizes = {12, 14};
    private static final String[] colors = {"Back", "Blue"};
    private static final String filePath = "src/Flyweight_DP/";

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        textEditor.create(createTexts("Java"));
        textEditor.save(filePath + "doc.txt");

        textEditor.create(createTexts("Python"));
        textEditor.save(filePath + "python_doc.txt");

        // --------------------- Edit text file ------------------
        String fileName = filePath + "doc.txt";
        textEditor.edit(fileName, createTexts("HelloWorldCS5800"));
        textEditor.save(fileName);

//        TextEditor textEditor = new TextEditor();
//        textEditor.create(createTexts("Java"));
//        textEditor.save(filePath + "java_doc.txt");
//
//        TextEditor textEditor2 = new TextEditor();
//        textEditor2.create(createTexts("Python"));
//        textEditor2.save(filePath + "python_doc.txt");
//
//        // --------------------- Edit the test.txt file ------------------
//        TextEditor textEditor3 = new TextEditor();
//        String fileName = filePath + "java_doc.txt";
//        textEditor3.edit(fileName, createTexts("HelloWorldCS5800"));
//        textEditor3.save(fileName);
    }

    public static List<Text> createTexts(String words){
        List<Text> texts = new ArrayList<>();
        for(int i=0; i < words.length(); i++) {
            String randomColor = colors[(int)(Math.random() * colors.length)];
            String randomFont = fonts[(int)(Math.random() * fonts.length)];
            int randomFontSize = fontSizes[(int)(Math.random() * fontSizes.length)];
            texts.add(new Text(words.substring(i, i+1), randomFont, randomFontSize, randomColor));
        }
        return texts;
    }

}
