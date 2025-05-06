package AlgebraCalculator.buteelt.src.test.java.com.example;

import AlgebraCalculator.buteelt.src.main.java.labxx.sict.must.edu.mn.Division;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionTest {
    @Test
    void testDivideNormal() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(4.0, 2.0), "4 / 2 should equal 2");
    }

    @Test
    void testDivideByZero() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(4.0, 0.0),
            "Dividing by zero should throw IllegalArgumentException");
    }
}
