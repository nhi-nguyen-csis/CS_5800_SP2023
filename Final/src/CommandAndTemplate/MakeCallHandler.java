package CommandAndTemplate;

public class MakeCallHandler extends Handler{
    public MakeCallHandler(Command command) {
        this.command = command;
    }

    @Override
    public void validateUserInput() {
        System.out.println("User validation from MakeCallHandler");
    }

    @Override
    public void logRequest() {
        System.out.println("Log User Phone Request");
    }

    @Override
    public void notifyRequestStatus() {
        System.out.println("Complete Phone call request");
    }
}
