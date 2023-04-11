package Decorator;

public class MilkShake implements MenuItem {
    private double cost;
    private String size;

    public MilkShake(String size){
        if(size.equalsIgnoreCase("small")){
            cost = 2.00;
        }else if(size.equalsIgnoreCase("large")){
            cost = 2.75;
        }
        this.size = size;
    }

    @Override
    public String getDescription() {
        return String.format("%s Milk Shake", size);
    }

    public double getCost() {
        return cost;
    }
}

