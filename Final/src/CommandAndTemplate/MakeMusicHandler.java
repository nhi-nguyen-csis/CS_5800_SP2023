package CommandAndTemplate;

public class MakeMusicHandler extends Handler{
    public MakeMusicHandler(Command command) {
        this.command = command;
    }

    @Override
    public void validateUserInput() {
        System.out.println("User validation from MakeMusicHandler");
    }

    @Override
    public void logRequest() {
        System.out.println("Log User Music Request");
    }

    @Override
    public void notifyRequestStatus() {
        System.out.println("Complete Music request");
    }
}
