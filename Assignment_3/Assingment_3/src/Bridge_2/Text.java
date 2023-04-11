package Bridge_2;

public class Text implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Text sent");
    }
}

