package Question_2;

public class PorscheCarFactory extends CarFactory{
    static final String CAR_NAME = "Porsche Car";
    private static PorscheCarFactory porscheFactory;

    private PorscheCarFactory() {
        super();
    }

    public static PorscheCarFactory getInstance() {
        if (porscheFactory == null) {
            porscheFactory = new PorscheCarFactory();
        }else {
            System.out.printf("Warning! Only 1 %s Factory can be created. " +
                    "The existing factory will be used to build the new car%n", CAR_NAME);
        }
        return porscheFactory;
    }

    public void build(String carType, int year){
        this.carType = carType;
        this.year = year;
        showInfoCar();
    }

    public void repair(){
        System.out.printf("Repairing %s%n", CAR_NAME);
    }

    public void restore(){
        System.out.printf("Restoring %s%n", CAR_NAME);
    }

    public void showInfoCar() {
        System.out.printf("The %s Factory have built a car with following details:%n", CAR_NAME);
        System.out.println(super.toString());
    }
}
