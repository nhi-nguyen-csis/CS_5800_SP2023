package Bridge_2;

public class WhatsAppMessagingApp implements MessageApps {

    public static final String APP_NAME = "WhatsApp";

    private MessageType message;

    public WhatsAppMessagingApp(MessageType message) {
        this.message = message;
    }

    public void send() {
        System.out.printf("%s ", APP_NAME);
        message.sendMessage();
    }

}

