package Bridge_2;

public class FacebookMessagingApp implements MessageApps {

    public static final String APP_NAME = "Facebook";
    private MessageType messageType;

    public FacebookMessagingApp(MessageType messageType) {
        this.messageType = messageType;
    }

    public void send() {
        System.out.printf("%s ", APP_NAME);
        messageType.sendMessage();
    }
}

