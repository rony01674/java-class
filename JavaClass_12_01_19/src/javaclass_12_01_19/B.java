package javaclass_12_01_19;

public class B extends A {

    double salary;

    public B() {
    }

    public B(double salary) {
        this.salary = salary;
    }

    public B(double salary, int id, String name, byte color) {
        super(id, name, color);
        this.salary = salary;
    }

}
