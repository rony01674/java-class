package javaclass_14_01_19.Chapter12;

import java.util.Scanner;

public class QuotientWithException {

    public static int quotient(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Divisor cannot be zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two integers
        System.out.println("Enter Two Integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: an integer " + "cannot be divided by zero");
        }
        System.out.println("Execution continues....");

    }
}
