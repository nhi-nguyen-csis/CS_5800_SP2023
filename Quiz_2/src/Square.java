public class Square {
    private String locationID;
    public Square(String locationID) {
        this.locationID = locationID;
    }

    public void squarePayment(double amount) {
        System.out.print("Square payment of " + amount);
        System.out.println(" from location ID: " + locationID + "");
    }
}
