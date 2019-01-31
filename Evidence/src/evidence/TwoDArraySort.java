package evidence;

import java.util.Arrays;

public class TwoDArraySort {

    public static void main(String[] args) {
        int[][] array = {{1, 6, 32, 4}, {18, 5, 28}, {12, 65, 61, 30}};
        //For sum
        int sum = 0;
        for (int[] is : array) {
            Arrays.sort(is);
            for (int i : is) {
                //for sum
                sum += i;
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //for sum
        System.out.println(sum);
    }
}
