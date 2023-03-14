package Aggregation;

public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher){
        setTitle(title);
        setPublisher(publisher);
        setAuthor(author);
    }

    public String getTextbookInfo(){
        return String.format("Textbook: %s, Author: %s, Publiser: %s%n", getTitle(), getAuthor(), getPublisher());
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
