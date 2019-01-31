package evidence;

import java.math.BigInteger;

public class PrimeNumber {

    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        checkPrime(x);
        isPrime(2);
    }
// way-1

    static void checkPrime(int[] numbers) {

        for (int number : numbers) {
            if (BigInteger.valueOf(number).isProbablePrime(1)) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
// way-2

    static void isPrime(int number) {
        if (BigInteger.valueOf(number).isProbablePrime(1)) {
            System.out.print(number + " is Prime ");
        } else {
            System.out.print(number + " is Not Prime ");
        }
    }

}
