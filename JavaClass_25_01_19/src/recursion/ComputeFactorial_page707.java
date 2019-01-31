package recursion;

import java.util.Scanner;

public class ComputeFactorial_page707 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non negative integer: ");
        int n = input.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    //Return the factorial for the specified number
    public static long factorial(int num) {
        if (num == 0) {
            return 1;//Base case
        } else {
            return num * factorial(num - 1);//Recursive call
        }
    }

}
