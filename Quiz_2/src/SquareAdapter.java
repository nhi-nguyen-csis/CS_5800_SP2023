public class SquareAdapter {
    private Square square;
    public SquareAdapter(Square square){
        this.square = square;
    }
    public void pay(double amount) {
        square.squarePayment(amount);
    }
}
