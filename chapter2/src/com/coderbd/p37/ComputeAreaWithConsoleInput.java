package com.coderbd.p37;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

    static int num1, num2, result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for num1: ");
        num1 = sc.nextInt();
        System.out.println("Enter Number for num2: ");
        num2 = sc.nextInt();
        result = num1 + num2;
        System.out.println("Result: " + result);
    }
}
