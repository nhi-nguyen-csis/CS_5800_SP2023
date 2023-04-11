package Decorator;

public class CheeseBurger implements MenuItem {

    public final static double COST = 2.40;

    public String getDescription() {
        return "Cheese Burger";
    }

    public double getCost() {
        return COST;
    }
}
