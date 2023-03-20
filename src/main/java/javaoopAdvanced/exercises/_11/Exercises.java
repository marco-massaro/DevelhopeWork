package javaoopAdvanced.exercises._11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     * <p>
     * <p>
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     * <p>
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     * <p>
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        var x = Math.random() * 100;
        String isGreater = x >= 50 ? "x is greater than or equal to 50": "x is less than or equal to 50";
        System.out.println(isGreater);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create a record called "Person" with fields for name, age and address.
     * <p>
     * Add a toString method to Person to print out the data in a different format
     * <p>
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person johnA = new Person("John", 32, "123 fk street");
        System.out.println(johnA.toString());
    }

    /**
     * 3:
     * <p>
     * <p>
     * In the main method, create a BigInteger variable with a large value.
     * <p>
     * Create a BigDecimal variable with a large value
     * <p>
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     * <p>
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     * <p>
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigBoi = new BigInteger("200023200004000000004500000");
        BigDecimal bigDecBoi = new BigDecimal("0.00000000000000000000001");
        BigInteger biggerBoi = bigBoi.divide(new BigInteger("3"));
        BigDecimal dividedBoi = bigDecBoi.divide(new BigDecimal(3), RoundingMode.HALF_UP); // had to google this

        System.out.println(biggerBoi);
        System.out.println(dividedBoi);

    }

}

