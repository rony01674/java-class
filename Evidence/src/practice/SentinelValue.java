package practice;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num;
            num = input.nextInt();
        }
        System.out.println("Total: " + sum);
    }
}
