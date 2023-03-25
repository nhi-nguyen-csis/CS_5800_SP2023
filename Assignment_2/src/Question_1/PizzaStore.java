package Question_1;

public class PizzaStore {
    String storeName;
    Pizza_1 pizza1;

    public PizzaStore(String storeName, Pizza_1 pizza) {
        this.storeName = storeName;
        this.pizza1 = pizza;
    }

    public void eat(){
        System.out.println("Welcome to " + storeName);
        this.pizza1.info();
    }
}
