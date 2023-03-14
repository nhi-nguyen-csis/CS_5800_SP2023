package Polymorphism;

public class Ship {
    private String shipName;
    private String shipYear;

    // Constructor with all setters and getters
    public Ship(String shipName, String shipYear){
        setShipName(shipName);
        setShipYear(shipYear);
//        System.out.printf("We have just created %s - %s%n", getShipName(), getShipYear());
    }

    // A print function that will display the ship name and year it was built.
    public String toString() {
        return "Ship name: " + getShipName() + " | Ship year: " + getShipYear();
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipYear() {
        return shipYear;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipYear(String shipYear) {
        this.shipYear = shipYear;
    }
}
