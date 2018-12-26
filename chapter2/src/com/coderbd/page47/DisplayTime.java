package com.coderbd.page47;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        
        int hour = seconds / 3600;
        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; //seconds remaining
        System.out.println(seconds + " seconds is "+hour+ " hour, " + minutes + " minutes and "
                + remainingSeconds + " seconds");
    }
}
