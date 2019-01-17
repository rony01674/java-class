package javaclass_16_01_19;

import java.util.Scanner;

public class SentinalValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0) {
            sum += data;
            data = input.nextInt();
        }
        System.out.println("The sum is: " + sum);
    }
}
