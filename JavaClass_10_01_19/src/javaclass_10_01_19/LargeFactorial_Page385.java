package javaclass_10_01_19;

import java.math.*;

public class LargeFactorial_Page385 {

    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }

    String[] x = {"1", "2", "3", "4", "5"};
    String s;
}
