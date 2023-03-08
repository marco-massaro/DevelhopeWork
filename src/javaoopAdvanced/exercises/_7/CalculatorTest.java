package javaoopAdvanced.exercises._7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    /**
     * 1:
     * <p>
     * <p>
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     * <p>
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     * <p>
     * Verify that the methods return the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calc = new Calculator();
        Assertions.assertEquals(5,calc.add(2,3));
        Assertions.assertEquals(-4,calc.add(-2,-2));
        Assertions.assertEquals(0,calc.add(0,0));
        Assertions.assertEquals(3,calc.add(0,3));
        Assertions.assertEquals(-2,calc.add(0,-2));

        Assertions.assertEquals(-1,calc.subtract(2,3));
        Assertions.assertEquals(0, calc.subtract(-2,-2));
        Assertions.assertEquals(0,calc.subtract(0,0));
        Assertions.assertEquals(3,calc.subtract(6,3));
        Assertions.assertEquals(2,calc.subtract(0,-2));

    }

    /**
     * 2:
     * <p>
     * <p>
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     * <p>
     * Test the same kind of inputs as before as exercise 1
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Calculator calc = new Calculator();
        Assertions.assertEquals(6,calc.multiply(2,3));
        Assertions.assertEquals(4,calc.multiply(-2,-2));
        Assertions.assertEquals(0,calc.multiply(0,0));
        Assertions.assertEquals(0,calc.multiply(0,3));
        Assertions.assertEquals(-4,calc.multiply(2,-2));

        Assertions.assertEquals(2,calc.divide(6,3));
        Assertions.assertEquals(1, calc.divide(-2,-2));
        Assertions.assertEquals(-1,calc.divide(2,-2));
        Assertions.assertThrows(ArithmeticException.class,() -> calc.divide(10,0));
        Assertions.assertThrows(ArithmeticException.class,() -> calc.divide(3,0));
        Assertions.assertThrows(ArithmeticException.class,() -> calc.divide(0,0));
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /**
     * 3:
     * <p>
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     * <p>
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        // Test base = 0
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0.0, calculator.power(0, 10));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0, 0));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0, -10));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0, Double.POSITIVE_INFINITY));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0, Double.NEGATIVE_INFINITY));
        Assertions.assertTrue(Double.isNaN(calculator.power(0, Double.NaN)));

        // Test positive base
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0, 0));
        Assertions.assertEquals(10.0, calculator.power(10, 1));
        Assertions.assertEquals(100.0, calculator.power(10, 2));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(10, -1));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(10, -2));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(10, Double.POSITIVE_INFINITY));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(10, Double.NEGATIVE_INFINITY));
        Assertions.assertTrue(Double.isNaN(calculator.power(10, Double.NaN)));

        // Test negative base
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-10, 0));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-10, 1));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-10, 2));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-10, -1));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-10, -2));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-10, Double.POSITIVE_INFINITY));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-10, Double.NEGATIVE_INFINITY));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-10, Double.NaN));

        // Test decimal inputs
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0.5, 0));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0.5, 1));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0.5, 2));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0.5, -1));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0.5, -2));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0.5, Double.POSITIVE_INFINITY));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(-0.5, Double.NEGATIVE_INFINITY));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.power(0.5, Double.NaN));
    }
}
