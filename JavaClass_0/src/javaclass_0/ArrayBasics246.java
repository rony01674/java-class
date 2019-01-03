package javaclass_0;

public class ArrayBasics246 {

    public static void main(String[] args) {
        int[] intArr = new int[3];
        intArr[0] = 10;
        intArr[1] = 15;
        intArr[2] = 25;
        System.out.println("intArr Length: " + intArr.length);
        System.out.println("intArr");

        String str[] = new String[3];
        str[0] = "A......";

        System.out.println("str[0]:" + str[0]);

        double[] doubleArr = new double[3];
        doubleArr[0] = 100.0;
        System.out.println("doubleArr[0]:" + doubleArr[0]);

        int intArray[] = {5, 10, 15, 20, 25};
        System.out.println("Min: " + intArray[0]);
        System.out.println("Max: " + intArray[intArray.length - 1]);

        for (int i = 0; i <= intArray.length - 1; i++) {
            System.out.println(i + " : " + intArray[i]);
        }

        char[] city = {'D', 'a', 'l', 'a', 's'};
        System.out.println(city);
        for (int i = 0; i <= city.length - 1; i++) {
            System.out.println(city[i]);
        }

        /////////////////////////////////////////
        int[] intNumber = new int[100];

        for (int i = 0; i < intNumber.length; i++) {
            intNumber[i] = i;
        }
        System.out.println("Length Of intNumbers: " + intNumber.length);

        for (int j = 0; j < intNumber.length; j++) {
            if (intNumber[j] % 5 == 0) {
                System.out.println(j + " : " + intNumber[j]);
            }
        }

        /////////////For each or For in////////////
        for (int i : intNumber) {
            System.out.println(" :: " + i);
        }
    }

}
