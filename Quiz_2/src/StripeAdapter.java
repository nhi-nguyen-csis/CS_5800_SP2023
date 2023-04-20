public class StripeAdapter {
    private Stripe stripe;
    public StripeAdapter(Stripe stripe){
        this.stripe = stripe;
    }

    public void pay(double amount) {
        stripe.stripePayment(amount);
    }
}
