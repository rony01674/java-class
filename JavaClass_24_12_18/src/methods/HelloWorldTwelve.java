package methods;

import java.util.Scanner;

public class HelloWorldTwelve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for num 1 ");
        int n1 = sc.nextInt();
        System.out.println("Enter value for num 2 ");
        int n2 = sc.nextInt();
        System.out.println("Enter value for mode ie: +,-,*,/,%");
        //sc.nextline()
        String mode = sc.next();

        System.out.println(operateAll(n1, n2, mode.trim()));
    }

    public static int operateAll(int num1, int num2, String mode) {
        int result = 0;
        if (mode.equals("+")) {
            result = addition(num1, num2);
        } else if (mode.equals("-")) {
            result = subtraction(num1, num2);
        } else if (mode.equals("*")) {
            result = multiplication(num1, num2);
        } else if (mode.equals("/")) {
            result = division(num1, num2);
        } else if (mode.equals("%")) {
            result = modulus(num1, num2);
        }
        return result;
    }

    public static int addition(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    public static int subtraction(int num1, int num2) {
        int total = num1 - num2;
        return total;
    }

    public static int multiplication(int num1, int num2) {
        int total = num1 * num2;
        return total;
    }

    public static int division(int num1, int num2) {
        int total = num1 / num2;
        return total;
    }

    public static int modulus(int num1, int num2) {
        int total = num1 % num2;
        return total;
    }

}
