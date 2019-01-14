package javaclass_14_01_19;

public class Student {

    private int id;
    private String name;
    private String mobileNo;
    private String email;

    public Student(int id, String name, String mobileNo, String email) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + '}';
    }

}
