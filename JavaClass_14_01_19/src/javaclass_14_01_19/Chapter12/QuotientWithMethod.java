package javaclass_14_01_19.Chapter12;

import java.util.Scanner;

public class QuotientWithMethod {

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two integers
        System.out.println("Enter Two Integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = quotient(number1, number2);

        System.out.println(number1 + " / " + number2 + " is " + result);
    }
}
