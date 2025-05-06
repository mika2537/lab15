// File: MultiplicationTest.java
import AlgebraCalculator.buteelt.src.main.java.labxx.sict.must.edu.mn.Multiplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @Test
    void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 should equal 6");
    }

    @Test
    void testMultiplyNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0), "-2 * 3 should equal -6");
    }

    @Test
    void testMultiplyZero() {
        Multiplication calc = new Multiplication();
        assertEquals(0.0, calc.multiply(5.0, 0.0), "5 * 0 should equal 0");
    }
}
