package javaclass_10_01_19;

import java.util.Scanner;

public class PalindromeEx_Page396 {

    /**
     * main method
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //prompt the user to enter string
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        //display result
        System.out.println("Ignoring nonalphanumeric characters, \nis "+s+" a palindrome? "+isPlaindrome(s));
    }

    /**
     * return true if a string is a palindrome
     */
    public static boolean isPlaindrome(String s) {
        boolean status = false;
        StringBuilder str = new StringBuilder(s);
        String newStr = String.valueOf(str.reverse());
        if (newStr.equalsIgnoreCase(s)) {
            status = true;
        }
        return status;
    }

    public static int countPalindrome(String[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPlaindrome(s[i])) {
                counter++;
            }
        }
        return counter;
    }
}
