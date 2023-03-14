package Inheritance;

public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurity, double baseSalary){
        super(firstName, lastName, socialSecurity);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + " $" + getBaseSalary();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
