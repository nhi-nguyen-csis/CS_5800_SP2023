package CommandAndTemplate;

public abstract class Handler {
    Command command;
    public abstract void validateUserInput();
    public abstract void logRequest();
    public abstract void notifyRequestStatus();

    public void processRequest() {
        validateUserInput();
        logRequest();
        this.command.execute();
        notifyRequestStatus();
    }
}
