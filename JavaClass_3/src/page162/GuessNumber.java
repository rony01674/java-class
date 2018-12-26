package page162;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        //Generate a random number
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;
        while (guess != number) {
            // Prompt the user to guess a number
            System.out.print("Enter your Guess ");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }
    }
}
