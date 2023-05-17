package CommandAndTemplate;

public class SendEmailHandler extends Handler{
    public SendEmailHandler(Command command) {
        this.command = command;
    }

    @Override
    public void validateUserInput() {
        System.out.println("User validation from SendEmailHandler");
    }

    @Override
    public void logRequest() {
        System.out.println("Log User Email Request");
    }

    @Override
    public void notifyRequestStatus() {
        System.out.println("Complete Email request");
    }
}
