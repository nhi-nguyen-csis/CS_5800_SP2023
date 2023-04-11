package Decorator;

public class ExtraCheese extends ToppingDecorator {
    public static final double COST = 1.00;
    public ExtraCheese(MenuItem newMenuItem) {
        super(newMenuItem);
    }

    public String getDescription() {
        return menuItem.getDescription() + ", Extra Cheese";
    }

    public double getCost() {
        return menuItem.getCost() + COST;
    }
}

