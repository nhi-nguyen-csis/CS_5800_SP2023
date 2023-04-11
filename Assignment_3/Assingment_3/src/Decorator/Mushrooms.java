package Decorator;

public class Mushrooms extends ToppingDecorator {

    public static final double COST = 1.00;
    public Mushrooms(MenuItem newMenuItem) {
        super(newMenuItem);
    }

    public String getDescription() {
        return menuItem.getDescription() + ", Mushrooms";
    }

    public double getCost() {
        return menuItem.getCost() + COST;
    }
}

