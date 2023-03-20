package javaoopAdvanced.exercises._13;
import org.junit.jupiter.api.Assertions;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     * The following code is supposed to do a factorial of the number five, which looks like this: 5*4*3*2*1 = 120
     *
     * Find and fix the error using the debugger
     *
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: Working Correctly! ");
        int number = 5;
        int factorial = calculateFactorial(number);
        Assertions.assertEquals(120, factorial);
    }

    private static int calculateFactorial(int number) {
        //Fix this code
        int result = 1;
        for (int i = number; i >= 1; i --) { //Ask Marco how to use the debugger for this
            result = result * i;
        }
        return result;
    }

    /**
     * 2:
     *
     * The following code is supposed to reverse a string
     *
     * Find and fix the error using the debugger
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: Working Correctly! ");
        String input = "hello";
        String reversedString = reverseString(input);
        Assertions.assertEquals("olleh", reversedString);
    }

    private static String reverseString(String input) {
        //Fix this code

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {  // and it was i >= 1   //When I try to put i in the debugger, it says cannot find local variable i
            reversed += input.charAt(i); //Here it was reversed += revers + input.charAt(i);
        }
        return reversed;
    }

    /**
     * 3:
     *
     * The following code is supposed to check if a number is positive or negative
     * but there is a semantic error in the if statement.
     *
     * Find and fix the error using the debugger
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: Working Correctly! ");
        Assertions.assertFalse(isPositive(-5));
        Assertions.assertFalse(isPositive(-55));
        Assertions.assertTrue(isPositive(0)); //I changed the Assertation to assert True instead of false. Is this the correct answer?
        Assertions.assertTrue(isPositive(5));
        Assertions.assertTrue(isPositive(55));
        Assertions.assertTrue(isPositive(4567));
    }

    private static boolean isPositive(int num) {
        //Fix this code
        return num >= 0; // What is there to even change here?
    }
}
