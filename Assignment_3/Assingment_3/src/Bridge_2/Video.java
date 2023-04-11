package Bridge_2;

public class Video implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Video sent");
    }
}

