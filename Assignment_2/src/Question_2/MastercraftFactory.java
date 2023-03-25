package Question_2;

public class MastercraftFactory extends BoatFactory{
    static final String BOAT_NAME = "Mastercraft Boat";
    private static MastercraftFactory mastercraftFactory;

    private MastercraftFactory() {
        super();
    }

    public static MastercraftFactory getInstance() {
        if (mastercraftFactory == null) {
            mastercraftFactory = new MastercraftFactory();
        } else {
            System.out.printf("Warning! Only 1 %s Factory can be created. " +
                    "The existing factory will be used to build the new boat%n", BOAT_NAME);
        }
        return mastercraftFactory;
    }

    @Override
    public void build(String boatType, int year, int length){
        this.boatType = boatType;
        this.year = year;
        this.length = length;
        showInfo();
    }

    public void showInfo() {
        System.out.printf("The %s Factory have built a boat with following details:%n",BOAT_NAME);
        System.out.println(super.toString());
    }

    @Override
    public void repair() {
        System.out.printf("Repairing %s%n%n", BOAT_NAME);
    }

    @Override
    public void restore() {
        System.out.printf("Restoring %s%n%n", BOAT_NAME);
    }
}
