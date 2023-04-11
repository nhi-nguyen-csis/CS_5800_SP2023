package Decorator;

public class SoftDrink implements MenuItem {
    private double cost;
    private String size;

    public SoftDrink(String size){
        if(size.equalsIgnoreCase("small")){
            cost = 1.00;
        }else if(size.equalsIgnoreCase("medium")){
            cost = 1.25;
        }else if(size.equalsIgnoreCase("large")){
            cost = 1.50;
        }
        this.size = size;
    }


    @Override
    public String getDescription() {
        return String.format("%s Soft Drink", size);
    }

    public double getCost() {
        return cost;
    }
}
