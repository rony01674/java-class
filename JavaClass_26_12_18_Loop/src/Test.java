
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        WhiltLoop.printFirstNumToSecondNum(1, 10);
        System.out.println("Sum: " + WhiltLoop.makeSumFromFirstNumToSecondNum(1, 10));
        ForLoop.printRangeByForLoop(1, 10);
        Scanner input = new Scanner(System.in);
        WhiltLoop.workWithSentinelValue(input);

    }
}
