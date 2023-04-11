package Bridge_2;

public class Image implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Image sent");
    }
}

