package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MinMAxNumberFromArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to check?");
        int num = input.nextInt();

        Integer[] array = new Integer[num];
        System.out.println("Enter your numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort(array);

        System.out.println("Min number is: " + array[0] + " Maximum number is: " + array[array.length - 1]);
    }
}
