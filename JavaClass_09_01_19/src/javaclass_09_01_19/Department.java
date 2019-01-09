package javaclass_09_01_19;

public class Department {
    private int id;
    private String depName;

    public Department() {
    }

    public Department(int id, String depName) {
        this.id = id;
        this.depName = depName;
    }

    public int getId() {
        return id;
    }

    public String getDepName() {
        return depName;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", depName=" + depName + '}';
    }
    
    
}
