package Inheritance;

public class CommisionEmployee extends Employee {

    private double commissionRate;
    private double grossSale;

    public CommisionEmployee(String firstName, String lastName, String socialSecurity,
                             double commissionRate, double grossSale){
        super(firstName, lastName, socialSecurity);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getCommissionRate() + "% - $" + getGrossSale();
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }
}
