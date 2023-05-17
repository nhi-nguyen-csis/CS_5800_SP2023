package CommandAndTemplate;

public class MakeCall implements Command{
    @Override
    public void execute() {
        System.out.println("Making a phone call");
    }
}
