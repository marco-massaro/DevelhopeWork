package javaadvanced._6;

import javaoopAdvanced.exercises._6.Days;
import javaoopAdvanced.exercises._6.Operator;
import javaoopAdvanced.exercises._6.Seasons;

import static javaoopAdvanced.exercises._6.Seasons.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days days : Days.values()) {
            System.out.println(days);
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons favoriteSeason = WINTER;
        switch (favoriteSeason) {
            case WINTER -> System.out.println(favoriteSeason.getMonths());
            case FALL -> System.out.println(FALL.getMonths());
            case SPRING -> System.out.println(SPRING.getMonths());
            case SUMMER -> System.out.println(SUMMER.getMonths());
        }
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        getNextTrafficLight(TrafficLight.RED);

    }
    public static TrafficLight getNextTrafficLight(TrafficLight currentTrafficLight) {
        switch (currentTrafficLight){
            case RED -> System.out.println(TrafficLight.GREEN);
            case YELLOW -> System.out.println(TrafficLight.RED);
            case GREEN -> System.out.println(TrafficLight.YELLOW);
            default -> System.out.println(("Invalid traffic light state"));
        }
        return currentTrafficLight;
    }
    private enum TrafficLight{
        RED,
        YELLOW,
        GREEN;
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days weekendDay = Days.SATURDAY;
        if (weekendDay.isWeekend()) {
            System.out.println("Weekday");
        } else {
            System.out.println("Weekend");
        }
    }


    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here
        double num1 = 5;
        double num2 = 2;
        Operator operator = Operator.ADD;
        double result = operator.apply(num1, num2);
        System.out.println(result);
    }

}
