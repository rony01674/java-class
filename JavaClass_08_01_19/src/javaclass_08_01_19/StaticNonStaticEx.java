package javaclass_08_01_19;

public class StaticNonStaticEx {

    int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        StaticNonStaticEx object = new StaticNonStaticEx();
        System.out.println("X: " + object.x);
        
        System.out.println("Y: "+y);
    }
}
