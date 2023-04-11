package Bridge;

public class WhatsAppMessagingApp extends MessageApps {

    public String appName = "WhatsApp";

    private MessageType message;
    public WhatsAppMessagingApp(String appName,MessageType message) {
        super(appName, message);
    }
}

