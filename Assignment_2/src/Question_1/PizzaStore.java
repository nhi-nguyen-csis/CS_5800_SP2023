package Question_1;

public class PizzaStore {
    String storeName;
    Pizza pizza;

    public PizzaStore(String storeName, Pizza pizza) {
        this.storeName = storeName;
        this.pizza = pizza;
    }

    public void eat(){
        System.out.println("Welcome to " + storeName);
        this.pizza.info();
    }
}
