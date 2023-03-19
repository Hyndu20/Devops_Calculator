import org.example.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 5, calculator.squareRoot(25), DELTA);
        assertEquals("Finding square root for True Positive", 10, calculator.squareRoot(100), DELTA);
    }
    @Test
    public void sqrootTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 5, calculator.squareRoot(9), DELTA);
        assertNotEquals("Finding square root for True Negative", -40, calculator.squareRoot(60), DELTA);
    }
    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for True Positive",3628800 , calculator.factorial(10), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 40320, calculator.factorial(8), DELTA);
    }
    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial of a number for True Negative", 2, calculator.factorial(3), DELTA);
        assertNotEquals("Finding factorial of a number for True Negative", 420, calculator.factorial(15), DELTA);
    }
    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 2.995732273553991, calculator.naturalLog(20), DELTA);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 10, calculator.naturalLog(6.8), DELTA);
        assertNotEquals("Finding natural log for True Negative", 20, calculator.naturalLog(3.7), DELTA);
    }
    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 9, calculator.power(3, 2), DELTA);
        assertEquals("Finding power for True Positive", 100, calculator.power(10, 2), DELTA);
    }
    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 64, calculator.power(6, 4), DELTA);
        assertNotEquals("Finding power for True Negative", -64, calculator.power(-6, 2), DELTA);
    }
}

