package javaclass_12_01_19;

public class C extends B {

    public static void main(String[] args) {
        B b1 = new B();
        A b2 = new B();
        A a1 = new A();

        C c1 = new C();
        B c2 = new C();
        A c3 = new C();
        B c4 = new C();
        
        System.out.println("B1");
        System.out.println(b1 instanceof A);
        System.out.println(b1 instanceof B);
        System.out.println(b1 instanceof C);
        
        System.out.println("B2");
        System.out.println(b2 instanceof A);
        System.out.println(b2 instanceof B);
        System.out.println(b2 instanceof C);
        
        System.out.println("A1");
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof A);
        
        System.out.println("C1");
        System.out.println(c1 instanceof A);
        System.out.println(c1 instanceof A);
        System.out.println(c1 instanceof A);
    }

}
