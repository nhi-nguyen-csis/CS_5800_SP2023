package Aggregation;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook){
        this.courseName = courseName;
        this.instructor = instructor; // aggregation
        this.textbook = textbook;   // aggregation
    }

    @Override
    public String toString() {
        String courseName = String.format("Course: %s%n", getCourseName());
        String instructorInfo = instructor.getInstructorInfo();
        String textbookInfo = textbook.getTextbookInfo();

        return courseName + instructorInfo + textbookInfo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
