package javaclass_05_01_19;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int twoD[][] = {
            {2, 3, 4, 5, 6},
            {7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        System.out.println("TwoD[][]: " + twoD[2][4]);

        for (int oneD[] : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
