package methods;

public class HelloWorldEleven {

    public static void main(String[] args) {
        System.out.println(sayHi("Hello", " World!!!"));
        System.out.println(sayHi(10, 20));
        System.out.println(sayHi(10000, 20000));
    }

    public static String sayHi(String s1, String s2) {
        String msg = s1 + s2;
        return msg;
    }

    public static String sayHi(int n1, int n2) {
        String msg = String.valueOf(n1) + String.valueOf(n2);
        return msg;
    }

    public static long sayHi(long num1, long num2) {
        long result = num1 + num2;
        return result;
    }
}
