package Flyweight_DP;

import java.util.HashMap;

public class TextPropertiesFactory {

    private static final HashMap<String, TextProperties> textProperties = new HashMap<>();

    public TextProperties getTextProperties(String font, int fontSize, String color) {
        String textPropertiesKey = getKey(font, fontSize, color);
        TextProperties textPropertiesValue = textProperties.get(textPropertiesKey);

        if (textPropertiesValue == null) {
            textPropertiesValue = new TextProperties(font, fontSize, color);
            textProperties.put(textPropertiesKey, textPropertiesValue);
            // the code below for testing TextPropertiesFactory
            //System.out.printf("Creating a new text properties with the properties: %s, %d, %s%n", font, fontSize, color);
        }
        return textPropertiesValue;
    }

    private String getKey(String font, int fontSize, String color) {
        return String.format("%s, %d, %s", font, fontSize, color);
    }
}
