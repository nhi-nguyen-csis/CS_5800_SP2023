package Question_2;

public class FactoryDriver {
    public static void factoryTest() {
        showCarFactory();
        showAirplaneFactory();
        showBoatFactory();
    }


    public static void showBoatFactory(){
        BoatFactory seaRayFactory = Factory.createBoatFactory("Sea Ray");
        seaRayFactory.build("Sundeck", 2020, 2);
        seaRayFactory.repair();

        BoatFactory mastercraftFactory = Factory.createBoatFactory("Mastercraft");
        mastercraftFactory.build("X-14", 2021, 2);
        mastercraftFactory.restore();

        BoatFactory bertramFactory = Factory.createBoatFactory("Bertram");
        bertramFactory.build("Moppie", 2022,4);

        //TEST SINGLETON
        BoatFactory anotherBertramFactory = Factory.createBoatFactory("Bertram");
        anotherBertramFactory.build("Moppie", 2023, 2);

    }
    public static void showAirplaneFactory(){
        AirplaneFactory boeingFactory = Factory.createAirplaneFactory("Boeing");
        boeingFactory.build("737", 2020, 2);

        AirplaneFactory airbusFactory = Factory.createAirplaneFactory("Airbus");
        airbusFactory.build("A320", 2021, 2);

        AirplaneFactory embraerFactory = Factory.createAirplaneFactory("Embraer");
        embraerFactory.build("E190", 2022,4);

        //TEST SINGLETON
        AirplaneFactory anotherEmbraerFactory = Factory.createAirplaneFactory("Embraer");
        anotherEmbraerFactory.build("E195", 2023, 2);
    }

    public static void showCarFactory(){
        CarFactory hondaCarFactory = Factory.createCarFactory("Honda");
        hondaCarFactory.build("truck", 2023);

        CarFactory porscheCarFactory = Factory.createCarFactory("Porsche");
        porscheCarFactory.build("sport", 2020);

        CarFactory teslaCarFactory = Factory.createCarFactory("Tesla");
        teslaCarFactory.build("sedan", 2023);

        // TEST SINGLETON
        CarFactory anotherTeslaCarFactory = Factory.createCarFactory("Tesla");
        anotherTeslaCarFactory.build("SUV", 2022);

    }
}

