package CommandAndTemplate;

public class CommandDriver {
    public static void main(String[] args) {
        Handler makeCallHandler = new MakeCallHandler(new MakeCall());
        Handler makeMusicHandler = new MakeMusicHandler(new MakeMusic());
        Handler sendEmail = new SendEmailHandler(new SendEmail());
        Handler setReminderHandler = new SetReminderHandler(new SetReminder());

        makeCallHandler.processRequest();
        System.out.println("-------------");
        System.out.println();
        makeMusicHandler.processRequest();
        System.out.println("-------------");
        System.out.println();
        sendEmail.processRequest();
        System.out.println("-------------");
        System.out.println();
        setReminderHandler.processRequest();
    }
}
