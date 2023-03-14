package Aggregation;

public class CourseDriver {
    public static void run() {

        Instructor[] instructors = new Instructor[3];
        instructors[0] = new Instructor("Bill", "Gate", "113C-02");
        instructors[1] = new Instructor("Elon", "Musk", "24B-15");
        instructors[2] = new Instructor("Mark", "Zuckerberg", "07A-08");

        Textbook[] textbooks = new Textbook[3];
        textbooks[0] = new Textbook("Clean Code", "Uncle Bob", "Crown");
        textbooks[1] = new Textbook("How to quit college and become a billionaire", "Bill Gate", "New Life");
        textbooks[2] = new Textbook("From software developer to an entrepreneur", "Grace Hoper", "New Science");

        Course[] courses = new Course[3];
        courses[0] = new Course("CS 5800 - Advanced Software Engineer", instructors[0], textbooks[0]);
        courses[1] = new Course("CS 5765 - Advanced Engineering", instructors[1], textbooks[1]);
        courses[2] = new Course("CS 5902 - Entrepreneurship", instructors[2], textbooks[2]);

        for (Course c: courses){
            System.out.println(c.toString());
        }

    }
}
