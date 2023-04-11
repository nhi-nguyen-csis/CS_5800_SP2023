package Bridge_2;

public class TelegramMessagingApp implements MessageApps {

    public static final String APP_NAME = "Telegram";
    private MessageType message;
    public TelegramMessagingApp(MessageType message) {
        this.message = message;
    }

   public void send() {
        System.out.printf("%s ", APP_NAME);
        message.sendMessage();
    }

}

