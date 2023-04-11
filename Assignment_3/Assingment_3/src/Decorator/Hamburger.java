package Decorator;

public class Hamburger implements MenuItem {

    public final static double COST = 2.10;

    public String getDescription() {
        return "Hamburger";
    }

    public double getCost() {
        return COST;
    }
}

