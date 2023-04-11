package Decorator;

public class Bacon extends ToppingDecorator {

    public final static double COST = 1.50;
    public Bacon(MenuItem newMenuItem) {
        super(newMenuItem);
    }

    public String getDescription() {
        return menuItem.getDescription() + ", Bacon";
    }

    public double getCost() {
        return menuItem.getCost() + COST;
    }
}

