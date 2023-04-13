import Bridge.MessagingDriver;
import Decorator.BurgerDriver;

public class Main {
    public static void main(String[] args) {
        MessagingDriver.run();
        BurgerDriver.run();
    }
}