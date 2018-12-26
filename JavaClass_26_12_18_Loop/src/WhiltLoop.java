
import java.util.Scanner;

public class WhiltLoop {

    public static void printFirstNumToSecondNum(int num1, int num2) {
        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }
    }

    public static int makeSumFromFirstNumToSecondNum(int num1, int num2) {
        int sum = 0;
        while (num1 <= num2) {
            sum += num1;
            num1++;
        }
        return sum;
    }

    public static void workWithSentinelValue(Scanner input) {
        int sum = 0;
        int n1 = 1;
        while (true) {
            System.out.println("Enter Number " + n1 + " Time ");
            int num1 = input.nextInt();
            if (num1 != -1) {
                sum += num1;
                System.out.println("Sum: " + sum);
                n1++;
            } else {
                break;
            }
        }
    }
}
