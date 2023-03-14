package Polymorphism;

public class CargoShip extends Ship{
    private int tonnage;

    public CargoShip(String shipName, String shipYear, int tonnage){
        super(shipName, shipYear);
        setTonnage(tonnage);

    }

    @Override
    public String toString() {
        return super.toString() + " | Ship capacity: " + getTonnage();
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
}
