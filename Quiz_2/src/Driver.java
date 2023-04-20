public class Driver {
    public static void main(String[] args) {

        Paypal paypal_customer = new Paypal("nhinnguyen@cpp.edu");
        PaypalAdapter paypalAdapter = new PaypalAdapter(paypal_customer);
        paypalAdapter.pay(100);
        System.out.println("--------------------");
        Stripe stripe_customer = new Stripe("Elon Musk", "123456789", "12/2023");
        StripeAdapter stripeAdapter = new StripeAdapter(stripe_customer);
        stripeAdapter.pay(200);
        System.out.println("--------------------");
        Square square_customer = new Square("PomonaCA92802");
        SquareAdapter squareAdapter = new SquareAdapter(square_customer);
        squareAdapter.pay(300);
    }
}
