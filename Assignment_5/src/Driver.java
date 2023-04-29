package Test;

import java.util.Iterator;
import java.util.List;

public class Driver {
    private static final ChatServer chatServer = new ChatServer();
    public static void main(String[] args) {
        User twitter_ceo = new User("Elon_Mush", chatServer);
        User google_ceo = new User("Sundar_Pichai", chatServer);
        User facebook_ceo = new User("Mark_Zuckerberg", chatServer);
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(twitter_ceo, List.of(google_ceo), "Hello, Sundar_pichai! I'm Elon!"));
        chatServer.sendMessage(new Message(twitter_ceo, List.of(facebook_ceo), "Hello, Mark_Zuckerberg! I'm Elon!"));
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(facebook_ceo, List.of(twitter_ceo), "Hello, Elon. I'm Mark!"));
        System.out.println("----------------------------------");
        google_ceo.blockerUsers(twitter_ceo);
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(twitter_ceo, List.of(google_ceo, facebook_ceo), "Mark, I want to buy your Facebook company!"));
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(facebook_ceo, List.of(twitter_ceo), "How much do you want, Elon?"));
        System.out.println("----------------------------------");
        System.out.println("Mark_Zuckerberg unsent last message");
        chatServer.undoLastMessage(facebook_ceo);
        System.out.printf("Now, Mark_Zuckerberg's last message is '%s'\n", facebook_ceo.getChatHistory().getLastSentMessages());
        System.out.println("----------------------------------");
        System.out.println("Sundar_Pichai unsent last message:");
        chatServer.undoLastMessage(google_ceo);
        System.out.println("----------------------------------");
        // Test iterating over all messages in user1's chat history
        System.out.println("Iterating over all messages in Mark_Zuckerberg's chat history:");
        Iterator<Message> allMessagesIterator = facebook_ceo.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        System.out.println("Iterating over all messages in Elon Musk's chat history:");
        allMessagesIterator = twitter_ceo.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
    }
}
