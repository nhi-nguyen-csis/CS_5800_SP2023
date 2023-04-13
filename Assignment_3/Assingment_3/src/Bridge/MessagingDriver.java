package Bridge;

public class MessagingDriver {
    public static void run() {
        WhatsAppMessagingApp whatsApp = new WhatsAppMessagingApp("WhatsApp", new Text());
        whatsApp.send();
        whatsApp = new WhatsAppMessagingApp("WhatsApp", new Image());
        whatsApp.send();
        whatsApp = new WhatsAppMessagingApp("WhatsApp", new Video());
        whatsApp.send();

        FacebookMessagingApp facebook = new FacebookMessagingApp("Facebook", new Image());
        facebook.send();
        facebook = new FacebookMessagingApp("Facebook", new Video());
        facebook.send();
        facebook = new FacebookMessagingApp("Facebook", new Text());
        facebook.send();

        TelegramMessagingApp telegram = new TelegramMessagingApp("Telegram", new Text());
        telegram.send();
        telegram = new TelegramMessagingApp("Telegram", new Video());
        telegram.send();
        telegram = new TelegramMessagingApp("Telegram", new Image());
        telegram.send();
    }
}
