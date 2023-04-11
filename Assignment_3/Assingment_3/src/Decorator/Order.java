package Decorator;

import java.util.ArrayList;

public class Order {
    ArrayList<MenuItem> order = new ArrayList<MenuItem>();
    String orderNumber;
    CustomerLoyalty customerLoyalty;

    public Order(String orderNumber, String customerLoyalty) {
        this.orderNumber = orderNumber;
        this.customerLoyalty = new CustomerLoyalty(customerLoyalty);
    }

    public Order(String orderNumber) {
        this(orderNumber, "Regular");
    }

    public void addItem(MenuItem item) {
        order.add(item);
    }

    private void showCost() {
        double cost = 0;
        for (MenuItem item : order) {
            cost += item.getCost();
        }
        System.out.printf("Total Cost before discount: $%.2f%n", cost);
        double costApplyDiscount = customerLoyalty.applyDiscount(cost);
        System.out.printf("Total Cost after discount: $%.2f%n", costApplyDiscount);
    }

    private String orderDescription() {
        String description = String.format("\nOrder Number %s: ", orderNumber);
        for (MenuItem item : order) {
            description += item.getDescription() + ", ";
        }
        return description;
    }

    public void receipt(){
        System.out.println(orderDescription());
        showCost();
    }

}
