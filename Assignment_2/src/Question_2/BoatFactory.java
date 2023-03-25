package Question_2;

abstract class BoatFactory implements Buildable, Repairable, Restorable {
    String boatType;
    int length;
    int year;

    public abstract void build(String boatType, int year, int length);

    public void build(String boatType, int year){
        this.boatType = boatType;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Type: %s | Length: %d | Year: %d%n", boatType, length, year);
    }
}
