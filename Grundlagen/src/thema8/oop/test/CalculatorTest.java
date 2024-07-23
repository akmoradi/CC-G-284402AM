package thema8.oop.test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

	public void testAddPositiveNumbers() {
        assertEquals(5, Calculator.add(2, 3), 0.0001);
        assertEquals(100, Calculator.add(50, 50), 0.0001);
    }

	public void testAddNegativeNumbers() {
        assertEquals(-5, Calculator.add(-2, -3), 0.0001);
        assertEquals(-100, Calculator.add(-50, -50), 0.0001);
    }

	public void testAddPositiveAndNegativeNumbers() {
        assertEquals(1, Calculator.add(-2, 3), 0.0001);
        assertEquals(-1, Calculator.add(2, -3), 0.0001);
    }


	public void testAddWithZeros() {
        assertEquals(2, Calculator.add(2, 0), 0.0001);
        assertEquals(0, Calculator.add(0, 0), 0.0001);
        assertEquals(-2, Calculator.add(0, -2), 0.0001);
    }


	public void testAddWithBoundaryValues() {
        assertEquals((double) Integer.MAX_VALUE + 1, Calculator.add(Integer.MAX_VALUE, 1), 0.0001);
        assertEquals((double) Integer.MIN_VALUE - 1, Calculator.add(Integer.MIN_VALUE, -1), 0.0001);
    }
}
