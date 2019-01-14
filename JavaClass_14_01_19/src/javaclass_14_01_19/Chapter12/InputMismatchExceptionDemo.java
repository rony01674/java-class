package javaclass_14_01_19.Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();

                //Display the result
                System.out.println("The nmber entered is " + number);
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Try again. (" + " Incorrect input: an integer is required)");
                input.nextLine();//Discard input
            }
        } while (continueInput);
    }
}
