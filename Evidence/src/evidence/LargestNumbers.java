package evidence;

import java.util.Scanner;

public class LargestNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        isLargestNumber(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    static void isLargestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is Largest Number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is Largest Number");
        } else {
            System.out.println(n3 + " is Largest Number");
        }
    }
}
