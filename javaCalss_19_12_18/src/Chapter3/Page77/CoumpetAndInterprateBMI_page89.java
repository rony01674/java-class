package Chapter3.Page77;

import java.util.Scanner;

public class CoumpetAndInterprateBMI_page89 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter weight in pounds
        System.out.print("Enter Weight in Pounds: ");
        double weight = input.nextDouble();
        // Prompt The User to enter height in inches
        System.out.print("Enter Height in Inches: ");
        double height = input.nextDouble();
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCHES = 0.0254; // Constant
        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCHES;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
