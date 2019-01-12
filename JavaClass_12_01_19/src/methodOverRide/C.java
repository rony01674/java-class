package methodOverRide;

public class C extends B {

    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        B b2 = new B();

        a.sayHello();
        b.sayHello();
        b2.sayHello();
        b2.sayHi();
    }
}
