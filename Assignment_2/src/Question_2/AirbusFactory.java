package Question_2;

public class AirbusFactory extends AirplaneFactory {
    static final String AIRPLANE_NAME = "Airbus Airplane";
    private static AirbusFactory airbusFactory;

    private AirbusFactory() {
        super();
    }

    public static AirbusFactory getInstance() {
        if (airbusFactory == null) {
            airbusFactory = new AirbusFactory();
        } else {
            System.out.printf("Warning! Only 1 %s Factory can be created. " +
                    "The existing factory will be used to build the new airplane%n", AIRPLANE_NAME);
        }
        return airbusFactory;
    }

    @Override
    public void build(String airplaneType, int year, int engineCount){
        this.airplaneType = airplaneType;
        this.year = year;
        this.engineCount = engineCount;
        showInfo();
    }

    public void repair(){
        System.out.printf("Repairing %s%n", AIRPLANE_NAME);
    }

    public void restore(){
        System.out.printf("Restoring %s%n", AIRPLANE_NAME);
    }

    public void showInfo() {
        System.out.printf("The %s Factory have built an airplane with following details:%n", AIRPLANE_NAME);
        System.out.println(super.toString());
    }
}
