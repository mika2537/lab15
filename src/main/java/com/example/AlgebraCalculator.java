package com.example;

import java.util.Scanner;

public class AlgebraCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform all 7 operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN; // Avoid division by zero
        double modulus = num2 != 0 ? num1 % num2 : Double.NaN;
        double power = Math.pow(num1, num2);
        double average = (num1 + num2) / 2;

        // Print results
        System.out.println("\nResults:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
        System.out.println("Power: " + power);
        System.out.println("Average: " + average);

        scanner.close();
    }
}