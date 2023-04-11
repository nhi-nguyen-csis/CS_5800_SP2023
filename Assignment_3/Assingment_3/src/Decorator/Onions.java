package Decorator;

public class Onions extends ToppingDecorator {
    public final static double COST = 0.25;

    public Onions(MenuItem menuItem) {
        super(menuItem);
    }

    public String getDescription() {
        return menuItem.getDescription() + ", Onions";
    }

    public double getCost() {
        return menuItem.getCost() + 0.25;
    }
}

