package labxx.sict.must.edu.mn;
import java.util.Scanner;
/**
 * This program performs basic algebraic operations on two numbers.
 * It includes addition, subtraction, multiplication, division, modulus,
 * power, and average calculations.
 */
// package: labxx.sict.must.edu.mn
// class: AlgebraCalculator
// description: This program performs basic algebraic operations on two numbers.
// It includes addition, subtraction, multiplication, division, modulus,
// power, and average calculations.
public class AlgebraCalculator {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN;
        double modulus = num2 != 0 ? num1 % num2 : Double.NaN;
        double power = Math.pow(num1, num2);
        double average = (num1 + num2) / 2;
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
