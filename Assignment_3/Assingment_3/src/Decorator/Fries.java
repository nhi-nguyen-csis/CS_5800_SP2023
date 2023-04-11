package Decorator;

public class Fries implements MenuItem {
    public static final double COST = 1.60;

    public String getDescription() {
        return "French Fries";
    }

    public double getCost() {
        return COST;
    }
}

