package Question_2;

public class TeslaCarFactory extends CarFactory{
    static final String CAR_NAME = "Tesla";
    private static TeslaCarFactory teslaFactory;

    private TeslaCarFactory() {
        super();
    }

    public static TeslaCarFactory getInstance() {
        if (teslaFactory == null) {
            teslaFactory = new TeslaCarFactory();
        }else {
            System.out.printf("Warning! Only 1 %s Factory can be created. " +
                    "The existing factory will be used to build the new car%n", CAR_NAME);
        }
        return teslaFactory;
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
