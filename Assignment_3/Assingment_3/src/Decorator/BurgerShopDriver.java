package Decorator;

public class BurgerShopDriver {
    public static void main(String[] args) {
        showMenu();
        Order customerOrder1 = new Order("#1");
        customerOrder1.addItem(new Mushrooms(new CheeseBurger()));
        customerOrder1.addItem(new SoftDrink("Medium"));
        customerOrder1.receipt();

        Order customerOrder2 = new Order("#2", "VVIP");
        customerOrder2.addItem(new Onions(new Bacon(new Hamburger())));
        customerOrder2.addItem(new MilkShake("Large"));
        customerOrder2.receipt();

        Order customerOrder3 = new Order("#3", "VIP");
        customerOrder3.addItem(new ExtraCheese(new Fries()));
        customerOrder3.addItem(new SoftDrink("Small"));
        customerOrder3.addItem(new CheeseBurger());
        customerOrder3.receipt();
    }

    public static void showMenu(){
        System.out.println("Welcome to In & Out Burger Shop!");
        System.out.println("-------- Burgers & Fries Menu -------");
        System.out.printf("\tHamburger: $%.2f%n", Hamburger.COST);
        System.out.printf("\tCheese Burger: $%.2f%n", CheeseBurger.COST);
        System.out.printf("\tFrench fies: $%.2f%n", Fries.COST);
        System.out.println("----------- Add-on Options ----------");
        System.out.printf("\tBacon: $%.2f%n", Bacon.COST);
        System.out.printf("\tMushrooms: $%.2f%n", Mushrooms.COST);
        System.out.printf("\tExtra cheese: $%.2f%n", ExtraCheese.COST);
        System.out.printf("\tOnions: $%.2f%n", Onions.COST);
        System.out.println("------------ Drinks Menu ------------");
        System.out.println("Soft Drink: \n\t$1.00 (Small) \n\t$1.25 (Medium) \n\t$1.50 (Large)");
        System.out.println("Milk Shake: \n\t$2.00 (Small) \n\t$2.75 (Large)");
        System.out.println("--- Discount for Customer Loyalty ---");
        System.out.println("\tVIP: 5%");
        System.out.println("\tVVIP: 10%");
    }
}
