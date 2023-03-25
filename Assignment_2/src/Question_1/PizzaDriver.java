package Question_1;

public class PizzaDriver {

    public static void builderTest() {
        createPizzaHut();
        createLittleCeasarsPizza();
        createDominoPizza();
    }

    public static void createDominoPizza(){
        PizzaStore smallDomino = new PizzaStore("Domino",
                new Pizza.PizzaBuilder(3).
                        addChicken(true).
                        build());
        smallDomino.eat();

        PizzaStore largeDomino = new PizzaStore("Domino",
                new Pizza.PizzaBuilder(9).
                        addSpicyPork(true).
                        addHamAndPineapple(true).
                        addMushrooms(true).build());
        largeDomino.eat();
    }

    public static void createLittleCeasarsPizza(){
        PizzaStore smallLittleCeasars = new PizzaStore("Little Caesars",
                new Pizza.PizzaBuilder(6).
                        addHam(true).
                        addHamAndPineapple(true).
                        addPeppers(true).
                        addTomatoAndBasil(true).
                        addMushrooms(true).
                        addSaussage(true).build());
        smallLittleCeasars.eat();

        PizzaStore largeLittleCeasars = new PizzaStore("Little Caesars",
                new Pizza.PizzaBuilder(9).
                        addBeef(true).
                        addMushrooms(true).
                        addPeppers(true).
                        addExtraCheese(true).
                        addOlive(true).
                        addOnions(true).
                        addPepperoni(true).
                        addPesto(true).build());
        largeLittleCeasars.eat();
    }

    public static void createPizzaHut(){
        PizzaStore smallPizzaHut = new PizzaStore("Pizza Hut",
                new Pizza.PizzaBuilder(3).
                        addPepperoni(true).
                        addSpinach(true).build());
        smallPizzaHut.eat();

        PizzaStore largePizzaHut = new PizzaStore("Pizza Hut",
                new Pizza.PizzaBuilder(9).
                        addBacon(true).
                        addMushrooms(true).
                        addOnions(true).build());
        largePizzaHut.eat();
    }

}
