package Bridge;

public abstract class MessageApps {
    private MessageType message;
    public String appName;
    public MessageApps(String appName, MessageType message){
        this.appName = appName;
        this.message = message;
    }

    public void send(){
        System.out.printf("%s ", appName);
        this.message.sendMessage();
    }
}
