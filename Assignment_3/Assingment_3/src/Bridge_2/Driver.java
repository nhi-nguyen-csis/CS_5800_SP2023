package Bridge_2;


public class Driver {
    public static void main(String[] args) {
        WhatsAppMessagingApp whatsApp = new WhatsAppMessagingApp(new Text());
        whatsApp.send();
        whatsApp = new WhatsAppMessagingApp(new Image());
        whatsApp.send();

        FacebookMessagingApp facebook = new FacebookMessagingApp(new Video());
        facebook.send();
        facebook = new FacebookMessagingApp(new Image());
        facebook.send();

        TelegramMessagingApp telegram = new TelegramMessagingApp(new Text());
        telegram.send();
        telegram = new TelegramMessagingApp(new Video());
        telegram.send();
        telegram = new TelegramMessagingApp(new Image());
        telegram.send();
    }
}
