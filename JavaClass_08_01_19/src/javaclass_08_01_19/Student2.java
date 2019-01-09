package javaclass_08_01_19;

public class Student2 {

    private final String name;
    private final int age;
    private final boolean isScienceMajor;
    private final char gender;

    public Student2(String name, int age, boolean isScienceMajor, char gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isIsScienceMajor() {
        return isScienceMajor;
    }

    public char getGender() {
        return gender;
    }
    
    
}
