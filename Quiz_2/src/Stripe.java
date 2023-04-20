public class Stripe {
    private String cardHolderName;
    private String cardNumber;
    private String expDate;

    public Stripe(String cardHolderName, String cardNumber, String expDate) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }

    public void stripePayment(double amount) {
        System.out.println("Stripe payment of " + amount + " ");
        System.out.print("From card holder name: " + cardHolderName + " - ");
        System.out.print("Card number: " + cardNumber + " - ");
        System.out.println("Expiration date: " + expDate + " ");
    }
}
