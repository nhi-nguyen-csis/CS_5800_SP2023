package Polymorphism;

public class ShipDriver {
    final static int NUM_SHIP = 3;
    static Ship[] ships = new Ship[NUM_SHIP];

    public static void main(String[] args) {
        ships[0] = new Ship("Titanic", "1876");
        ships[1] = new CruiseShip("Elizabeth", "1997", 5670);
        ships[2] = new CargoShip("Tesla", "2021", 25000000);

        for (int i = 0; i < ships.length; i++){
            System.out.println(ships[i]);
        }

    }

}
