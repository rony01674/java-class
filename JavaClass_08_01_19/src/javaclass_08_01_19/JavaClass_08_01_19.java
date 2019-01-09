package javaclass_08_01_19;

import java.util.Arrays;

public class JavaClass_08_01_19 {

    public static void main(String[] args) {
        int twoD[][] = {{5, 6, 78, 1, 86, 1, 76, 3, 48,}, {5, 6, 87, 6, 9, 41, 3, 8, 1},
        {6, 6, 8, 3, 2, 64, 7, 51, 987,}, {6, 97, 200, 647, 87}
        };

        for (int[] oneD : twoD) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

}
