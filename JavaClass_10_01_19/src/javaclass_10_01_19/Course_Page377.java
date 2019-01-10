package javaclass_10_01_19;

public class Course_Page377 {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course_Page377(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        String[] s = new String[students.length - 1];
        for (int i = 0, j = 0; i < s.length; i++, j++) {
            if (students[i] == student) {
                j++;
            }
            s[i] = students[i];
        }
        this.students = s;
        numberOfStudents--;
    }

}
