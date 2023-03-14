package Inheritance;

import Inheritance.Employee;

public class HourlyEmployee extends Employee {
    private double wage;
    private double numberHours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurity,
                          double wage, double numberHours){
        super(firstName, lastName, socialSecurity);
        this.wage = wage;
        this.numberHours = numberHours;
    }

    @Override
    public String toString() {
        return super.toString() + " $" + getWage() + " " + getNumberHours();
    }

    public double getWage() {
        return wage;
    }

    public double getNumberHours() {
        return numberHours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setNumberHours(double numberHours) {
        this.numberHours = numberHours;
    }
}
