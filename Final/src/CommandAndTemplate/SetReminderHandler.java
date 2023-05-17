package CommandAndTemplate;

public class SetReminderHandler extends Handler{
    public SetReminderHandler(Command command) {
        this.command = command;
    }

    @Override
    public void validateUserInput() {
        System.out.println("User validation from SetReminderHandler");
    }

    @Override
    public void logRequest() {
        System.out.println("Log User Reminder Request");
    }

    @Override
    public void notifyRequestStatus() {
        System.out.println("Complete Reminder request");
    }
}
