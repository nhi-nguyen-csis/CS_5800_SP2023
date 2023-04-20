package Flyweight_DP;

public class TextDriver {
    private static final String[] fonts = {"Arial", "Times New Roman"};
    private static final int[] fontSizes = {12, 14};
    private static final String[] colors = {"Back", "Blue"};

    public static void main(String[] args) {

        String word = "HelloWorldCS5800";
        TextEditor[] textEditor = new TextEditor[word.length()];

        for (int i = 0; i < word.length(); ++i) {
            String randomColor = colors[(int)(Math.random() * colors.length)];
            String randomFont = fonts[(int)(Math.random() * fonts.length)];
            int randomFontSize = fontSizes[(int)(Math.random() * fontSizes.length)];
            textEditor[i] = TextEditorFactory.getTextEditor(randomFont, randomFontSize, randomColor);
            textEditor[i].create(word.substring(i, i + 1));
            textEditor[i].save();
            if (i == word.length() - 1){
                textEditor[i].edit(textEditor[i], "HelloWorldCS5800");
            }
        }
    }
}
