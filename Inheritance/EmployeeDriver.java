package Inheritance;

import Inheritance.BaseEmployee;
import Inheritance.CommisionEmployee;
import Inheritance.Employee;

public class EmployeeDriver {
    public static void run() {

        final int NUMBER_EMPLOYEE = 6;
        Employee[] list_employee = new Employee[NUMBER_EMPLOYEE];

        list_employee[0] = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        list_employee[1] = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        list_employee[2] = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        list_employee[3] = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        list_employee[4] = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        list_employee[5] = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);

        for(int i=0; i < NUMBER_EMPLOYEE; i++){
            System.out.println(list_employee[i]);
        }
    }
}
