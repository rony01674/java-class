package methods;

public class HelloWorldSeven {

    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(sayHello1());
        System.out.println(call());
    }

    public static String sayHello() {
        return HelloWorldSix.sayHello("Hello ", "World");
    }

    public static String sayHello1() {
        String msg = HelloWorldSix.sayHello("Asaduzzaman ", "Rony");
        return msg;
    }

    public static int call() {
        return HelloWorldSix.addition(5, 6);
    }
}
