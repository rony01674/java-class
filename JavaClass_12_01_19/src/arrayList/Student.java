package arrayList;

public class Student {

    private int id;
    private String name;
    private int rollNo;

    public Student(int id, String name, int rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", rollNo=" + rollNo + '}';
    }
    
    
}
