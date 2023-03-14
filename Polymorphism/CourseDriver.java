package Polymorphism;

import Aggregation.Course;
import Aggregation.Instructor;
import Aggregation.Textbook;

import java.util.ArrayList;

public class CourseDriver {

    public static void main(String[] args) {

        ArrayList<Instructor> instructors = new ArrayList<Instructor>();
        Instructor instructor_cs = new Instructor("Elon", "Musk", "12B-25");
        instructors.add(instructor_cs);
        Instructor instructor_econ = new Instructor("Malcomn", "Well", "32A-01");
        instructors.add(instructor_econ);

        ArrayList<Textbook> textbooks = new ArrayList<Textbook>();
        Textbook textbook_cs = new Textbook("Clean Code", "Uncle Bob", "Crown");
        textbooks.add(textbook_cs);
        Textbook textbook_econ = new Textbook("How did Sillicon Valley Bank go bankcrupt", "Bruno Mars", "New Life");
        textbooks.add(textbook_econ);

        Course course_cs = new Course("Advanced Software Engineering", instructor_cs, textbook_cs);
        System.out.println(course_cs);

        // ----------------------- test aggregation -----------------------
        course_cs = null; // destroy the course_cs object and it will be collected by the garbage collection
        // BUT the textbook_cs and instructor_cs continue to alive
        //System.out.println(textbook_cs.getTextbookInfo());
        //System.out.println(instructor_cs.getInstructorInfo());

        Course course_econ = new Course("Intro to Economics", instructor_econ, textbook_econ);
        System.out.println(course_econ);
    }
}
