package AlgebraCalculator.buteelt.src.main.java.labxx.sict.must.edu.mn;

/**
 * This class provides a method to divide two numbers.
 * It includes a method to perform the division operation.
 */
// package: labxx.sict.must.edu.mn
// class: Division  
// description: This class provides a method to divide two numbers.
// It includes a method to perform the division operation.
public class Division {
    /**
     * Divides first number by second number.
     * @param a numerator
     * @param b denominator
     * @return quotient of a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
