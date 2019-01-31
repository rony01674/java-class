package classExam;

import java.util.Scanner;

public class FindFactorial {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int factorial = 1;
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
