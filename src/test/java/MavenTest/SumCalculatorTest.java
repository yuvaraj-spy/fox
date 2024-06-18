package MavenTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import mavenPackage.SumCalculator;

import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    @Test
    public void testSumPositiveNumbers() {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(5, 10);
        assertEquals(15, result, "Sum of 5 and 10 should be 15");
    }

    @Test
    public void testSumNegativeNumbers() {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(-5, -10);
        assertEquals(-15, result, "Sum of -5 and -10 should be -15");
    }

    @Test
    public void testSumPositiveAndNegativeNumber() {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(5, -3);
        assertEquals(2, result, "Sum of 5 and -3 should be 2");
    }

    @Test
    public void testSumWithZero() {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(0, 10);
        assertEquals(10, result, "Sum of 0 and 10 should be 10");
    }

    @Test
    public void testSumWithLargeNumbers() {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(1000000, 2000000);
        assertEquals(3000000, result, "Sum of 1000000 and 2000000 should be 3000000");
    }
}

