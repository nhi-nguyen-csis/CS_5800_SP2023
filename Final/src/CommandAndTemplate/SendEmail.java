package CommandAndTemplate;

public class SendEmail implements Command{
    @Override
    public void execute() {
        System.out.println("Sending an email");
    }
}
