public class Paypal {
    private String userEmail;
    public Paypal(String userEmail) {
        this.userEmail = userEmail;
    }
    public void paypalPayment(double amount) {
        System.out.print("Paypal payment of " + amount);
        System.out.println(" from user email: " + userEmail + "");
    }
}
