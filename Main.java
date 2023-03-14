import Aggregation.CourseDriver;
import Composition.FolderDriver;
import Inheritance.EmployeeDriver;
import Polymorphism.ShipDriver;

public class Main {
    public static void main(String[] args){
        System.out.println("----------------------- QUESTION 1 ----------------------");
        EmployeeDriver employeeDriver = new EmployeeDriver();
        employeeDriver.run();
        System.out.println("\n----------------------- QUESTION 2 ----------------------");
        ShipDriver shipDriver = new ShipDriver();
        shipDriver.run();
        System.out.println("\n----------------------- QUESTION 3 ----------------------");
        CourseDriver courseDriver = new CourseDriver();
        courseDriver.run();
        System.out.println("----------------------- QUESTION 4 ----------------------");
        FolderDriver folderDriver = new FolderDriver();
        folderDriver.run();
    }
}