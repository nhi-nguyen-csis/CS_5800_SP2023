package Polymorphism;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String shipName, String shipYear, int maxPassengers){
        super(shipName, shipYear);
        setMaxPassengers(maxPassengers);
    }

    @Override
    public String toString() {
        return super.toString() + "| Max number of passenger: " + getMaxPassengers();
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
