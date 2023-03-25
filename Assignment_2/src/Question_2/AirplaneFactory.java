package Question_2;

abstract class AirplaneFactory implements Buildable, Repairable, Restorable{
    String airplaneType;
    int engineCount;
    int year;

    public void build(String airplaneType, int year){
        this.airplaneType = airplaneType;
        this.year = year;
    }

    public String toString(){
        return String.format("Type: %s | Engine Count: %d | Year: %d%n", airplaneType, engineCount, year);
    }

    public abstract void build(String airplaneType, int year, int engineCount);
}

