package Inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurity;

    public Employee(String firstName, String lastName, String socialSecurity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getSocialSecurity();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }
}
