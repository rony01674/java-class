package practice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String a, b = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want to ckeck: ");
        a = input.nextLine();
        int n = a.length();

        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
