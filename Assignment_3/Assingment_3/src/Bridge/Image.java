package Bridge;

public class Image implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Image sent");
    }
}

