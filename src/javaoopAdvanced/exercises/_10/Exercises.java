package javaoopAdvanced.exercises._10;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Person" with fields for name, age, and address.
     * <p>
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     * <p>
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Person person1 = new Person("Marco",32,"123 fk street");
        Person person2 = new Person("Aurora",26,"321 fk street");
        System.out.println(person1);
        System.out.println(person2);
    }

    /**
     * 2:
     * <p>
     * <p>
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     * <p>
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     * <p>
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person1 = new Person("Marco",32,"123 fk street");
        Person person2 = new Person("Aurora",26,"321 fk street");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}
