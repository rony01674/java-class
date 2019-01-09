package javaclass_08_01_19;

public class Student {

    String name; // NAme has the default value null
    int age; //age has the default value 0
    boolean isScienceMajor; // isScienceMajor has default value false
    char gender; // gender has defaulr value '\u0000'

    // Way 1 Default constructor and setter method
    public Student() {

    }

    public Student(String name, int age, boolean isScienceMajor, char gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsScienceMajor(boolean isScienceMajor) {
        this.isScienceMajor = isScienceMajor;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
