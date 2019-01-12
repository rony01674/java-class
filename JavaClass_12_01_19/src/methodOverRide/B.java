package methodOverRide;

public class B extends A {

    @Override
    public void sayHello() {
        System.out.println("Gom from class B"); //To change body of generated methods, choose Tools | Templates.
    }

    public void sayHi() {
        super.sayHello();
        System.out.println("Hi, I am from class B. sayHi method");
    }

}
