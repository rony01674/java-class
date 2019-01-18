package javaclass_18_01_19;

import java.util.Scanner;

public class JavaClass_18_01_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        int x = 0;

        while (sum != 0) {
            x += sum;
            sum = input.nextInt();
        }
        System.out.println("The Sum Is: " + x);
    }
}
