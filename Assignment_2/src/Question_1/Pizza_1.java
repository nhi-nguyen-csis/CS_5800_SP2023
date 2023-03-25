package Question_1;


import java.util.HashMap;

public class Pizza_1 extends Toppings {
    private int size;
    private HashMap<String, Boolean> orderedToppings = new HashMap<String, Boolean>();
    public Pizza_1(PizzaBuilder_1 builder){
        this.size = builder.size;
        this.pepperoni = builder.pepperoni;
        this.saussage = builder.saussage;
        this.mushrooms = builder.mushrooms;
        this.bacon = builder.bacon;
        this.onions = builder.onions;
        this.extraCheese = builder.extraCheese;
        this.peppers = builder.peppers;
        this.chicken = builder.chicken;
        this.olive = builder.olive;
        this.spinach = builder.spinach;
        this.tomatoAndBasil = builder.tomatoAndBasil;
        this.beef = builder.beef;
        this.ham = builder.ham;
        this.pesto = builder.pesto;
        this.spicyPork = builder.spicyPork;
        this.hamAndPineapple = builder.hamAndPineapple;
        this.orderedToppings = builder.orderedToppings;
    }

    public void info(){
        HashMap<Integer, String> pizzaSize = new HashMap<>();
        pizzaSize.put(3, "small");
        pizzaSize.put(6, "medium");
        pizzaSize.put(9, "large");
        System.out.printf("You have ordered a %s pizza with %d toppings: ",
                pizzaSize.get(size), orderedToppings.size());
        for (String topping : orderedToppings.keySet()) {
            if (orderedToppings.get(topping)) {
                System.out.printf("%s, ",topping);
            }
        }
        System.out.println("\nEnjoy your pizza!\n");
    }

    public static class PizzaBuilder_1 extends Toppings{
        private int size;
        private HashMap<String, Boolean> orderedToppings = new HashMap<String, Boolean>();

        public PizzaBuilder_1(int size){
            this.size = size;
        }

        public PizzaBuilder_1 addPepperoni(boolean pepperoni){
            this.pepperoni = pepperoni;
            orderedToppings.put("pepperoni", pepperoni);
            return this;
        }

        public PizzaBuilder_1 addSaussage(boolean saussage){
            this.saussage = saussage;
            orderedToppings.put("saussage", saussage);
            return this;
        }

        public PizzaBuilder_1 addBacon(boolean bacon) {
            this.bacon = bacon;
            orderedToppings.put("bacon", bacon);
            return this;
        }

        public PizzaBuilder_1 addOnions(boolean onions) {
            this.onions = onions;
            orderedToppings.put("onions", onions);
            return this;
        }

        public PizzaBuilder_1 addExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            orderedToppings.put("extra cheese", extraCheese);
            return this;
        }

        public PizzaBuilder_1 addPeppers(boolean peppers) {
            this.peppers = peppers;
            orderedToppings.put("peppers", peppers);
            return this;
        }

        public PizzaBuilder_1 addChicken(boolean chicken) {
            this.chicken = chicken;
            orderedToppings.put("chicken", chicken);
            return this;
        }

        public PizzaBuilder_1 addOlive(boolean olive) {
            this.olive = olive;
            orderedToppings.put("olives", olive);
            return this;
        }

        public PizzaBuilder_1 addSpinach(boolean spinach) {
            this.spinach = spinach;
            orderedToppings.put("spinach", spinach);
            return this;
        }

        public PizzaBuilder_1 addTomatoAndBasil(boolean tomatoAndBasil) {
            this.tomatoAndBasil = tomatoAndBasil;
            orderedToppings.put("tomato and basil", tomatoAndBasil);
            return this;
        }

        public PizzaBuilder_1 addBeef(boolean beef) {
            this.beef = beef;
            orderedToppings.put("beef", beef);
            return this;
        }

        public PizzaBuilder_1 addMushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            orderedToppings.put("mushrooms", mushrooms);
            return this;
        }

        public PizzaBuilder_1 addHam(boolean ham) {
            this.ham = ham;
            orderedToppings.put("ham", ham);
            return this;
        }

        public PizzaBuilder_1 addPesto(boolean pesto) {
            this.pesto = pesto;
            orderedToppings.put("pesto", pesto);
            return this;
        }

        public PizzaBuilder_1 addSpicyPork(boolean spicyPork) {
            this.spicyPork = spicyPork;
            orderedToppings.put("spicy pork", spicyPork);
            return this;
        }

        public PizzaBuilder_1 addHamAndPineapple(boolean hamAndPineapple) {
            this.hamAndPineapple = hamAndPineapple;
            orderedToppings.put("ham and pineapple", hamAndPineapple);
            return this;
        }

        public Pizza_1 build() {
            return new Pizza_1(this);
        }

    }
}
