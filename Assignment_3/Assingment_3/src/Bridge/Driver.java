package Bridge;

public class Driver {
    public static void main(String[] args) {
        WhatsAppMessagingApp whatsApp = new WhatsAppMessagingApp("WhatsApp", new Text());
        whatsApp.send();
        whatsApp = new WhatsAppMessagingApp("WhatsApp", new Image());
        whatsApp.send();

        FacebookMessagingApp facebook = new FacebookMessagingApp("Facebook", new Video());
        facebook.send();
        facebook = new FacebookMessagingApp("Facebook", new Image());
        facebook.send();

        TelegramMessagingApp telegram = new TelegramMessagingApp("Telegram", new Text());
        telegram.send();
        telegram = new TelegramMessagingApp("Telegram", new Video());
        telegram.send();
        telegram = new TelegramMessagingApp("Telegram", new Image());
        telegram.send();
    }
}
