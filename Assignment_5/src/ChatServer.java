package Test;

import java.util.ArrayList;
import java.util.List;

public class ChatServer { // Mediator class
    private static List<User> users;
    
    public ChatServer(){
        users = new ArrayList<>();
    }


    public void sendMessage(Message message){
        User sender = message.getSender();
        if(!users.contains(sender)){
            System.out.printf("User %s is not registered\n", sender.getUsername());
            return;
        }
        for (User receiver : message.getReceivers()){
            List<User> blockedAccounts = receiver.getBlockedUsers();
            if (blockedAccounts != null && blockedAccounts.contains(sender)){
                System.out.println("Cannot send message from " + sender.getUsername() + " to " + receiver.getUsername() +
                        " since " + sender.getUsername() + " is blocked by " + receiver.getUsername());
            } else{
                sender.sendMessage(message);
                System.out.printf("Successfully sent message from %s to %s\n", sender.getUsername(), receiver.getUsername());
                receiver.receiveMessage(message);
                System.out.printf("%s: %s received message from %s: '%s'\n", message.getTimestamp(),
                        receiver.getUsername(), sender.getUsername(), message.getTextMessage());
            }
        }
    }


    public void registerUser(User user) {
        users.add(user);
        System.out.printf("Successfully registered user %s\n", user.getUsername());
    }

    public void unregisterUser(User user) {
        users.remove(user);
    }

    public void undoLastMessage(User user){
        List<Message> sentMessages = user.getChatHistory().getSentMessages();
        if (sentMessages.size() == 0){
            System.out.printf("Cannot unsend last message as user %s has not sent any messages.\n", user.getUsername());
            return;
        }
        Message message = user.getChatHistory().getLastSentMessages();
        user.undoLastSentMessage();
        List<User> receivers = message.getReceivers();
        for (User receiver : receivers){
            receiver.getChatHistory().removeLastReceivedMessage(message);
        }
    }

    public List<User> getUsers(){
        return users;
    }
}
