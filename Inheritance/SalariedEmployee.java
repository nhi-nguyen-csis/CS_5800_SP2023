package Inheritance;

import Inheritance.Employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurity, double weeklySalary){
        super(firstName, lastName, socialSecurity);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + " $" +getWeeklySalary();
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
