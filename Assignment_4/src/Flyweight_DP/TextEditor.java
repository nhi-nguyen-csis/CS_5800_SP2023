package Flyweight_DP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextEditor implements Editable {
    private List<Text> text;

    public void create(List<Text> text) {
        this.text = text;
    }

    @Override
    public void edit(String fileName, List<Text> documentText) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new IOException("File not found: " + fileName);
            }
            FileWriter writer = new FileWriter(file);
            for(Text text : documentText) {
                writer.write(text.getText() + "\n");
            }
            writer.close();
            this.text = documentText;
            System.out.println("File edited successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while editing the file.");
            e.printStackTrace();
        }
    }


    @Override
    public void save(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for(int i = 0; i < text.size(); i++) {
                writer.write(text.get(i).getText() + "\n");
            }
            writer.close();
            System.out.println("Successfully save to the file " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

