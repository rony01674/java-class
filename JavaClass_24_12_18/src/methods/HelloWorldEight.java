package methods;

public class HelloWorldEight {

    public static void main(String[] args) {
        System.out.println(sayHello("Hello ", " World!!!"));
        System.out.println(sayHello1());
    }

    public static String sayHello(String s1, String s2) {
        return HelloWorldSix.sayHello(s1, s2);
    }

    public static String sayHello1() {
        String msg = HelloWorldSix.sayHello("Hello ", "World");
        return msg;
    }
}
