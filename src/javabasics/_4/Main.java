package javabasics._4;
public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int age = 31;
        System.out.println("My age is: " + age);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char initial = 'M';
        int age = 31;
        System.out.println("My age is " + age +", my initial is " + initial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //We are stating that we haven't eaten lunch
        boolean hasEatenLunch = false;
        //we are setting the cost of lunch to 5.99
        double lunchCost = 5.99;
        //we are stating the cost of lunch by concatenating a string with the cost
        System.out.println("Lunch cost=" + lunchCost);
        //we are stating whether we have eaten lunch using a string and a boolean
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
