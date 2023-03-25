package Question_2;

abstract class CarFactory implements Buildable, Repairable, Restorable{
    String carType;
    int year;

    public String toString(){
        return "Type: " + carType + " | Year: " + year +"\n";
    }
}
