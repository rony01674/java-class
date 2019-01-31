package evidence;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinFromNNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to check?");

        int n = input.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("Enter your numbers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0]
                + " Max: " + arr[arr.length - 1]);

    }
}
