package methods;

public class HelloWorldSix {

    public static void main(String[] args) {
        System.out.println(sayHello("Hello", " World"));
        System.out.println(addition(5, 6));
    }
    
    public static String sayHello(String msg1, String msg2) {
        String message = msg1 + msg2;
        return message;
    }
    
    public static int addition(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
}
