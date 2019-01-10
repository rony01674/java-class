package javaclass_10_01_19;

public class TestCourse_Page376 {

    public static void main(String[] args) {
        Course_Page377 course1 = new Course_Page377("Data Structures");
        Course_Page377 course2 = new Course_Page377("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course1.dropStudent("Anne Kennedy");

        course2.addStudent("Pater Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
    }
}
