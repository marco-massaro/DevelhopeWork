package javaoop.exercises._3;

import java.sql.SQLOutput;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     * <p>
     * Make sure there are 5 fields inside, if they are not simply create some more.
     * make every field private first.
     * <p>
     * Then create getters and setters for each of these 5 fields.
     * <p>
     * Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student1 = new Student(10, "Marco");
        student1.setAge(31);
        System.out.println("This student's age is " + student1.getAge());
        student1.setHeight(160);
        System.out.println("This student's height is " + student1.getHeight() + " cm");
        student1.setName("Bob");
        System.out.println("This student's name is " + student1.getName());
        student1.setLastName("Super");
        System.out.println("This student's last name is " + student1.getLastName());
        student1.setWeight(300);
        System.out.println("This student's weight is " + student1.getWeight() + " kg");

    }

    /**
     * 2: Create 3 setter constraints for the student class
     * <p>
     * Think about what reasonably constraints are?
     * <p>
     * Should a student be able to be a negative age?
     * <p>
     * Create a counter for one of the getters, try to think about
     * what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student2 = new Student(25, "Francesualdo");
        student2.setAge(9);
        System.out.println("Student's age = " + student2.getAge());
        System.out.println("Age has been checked " + student2.getAgeCheck() + " times");
        student2.setAge(31);
        System.out.println("Student's age = " + student2.getAge());
        System.out.println("Age has been checked " + student2.getAgeCheck() + " times");
        student2.setHeight(180);
        System.out.println(student2.getHeight());   //I included the string INSIDE the getter here
        student2.setHeight(300);
        System.out.println(student2.getHeight());  //I included the string INSIDE the getter here
        student2.setWeight(300);
        System.out.println("This student's weight is " + student2.getWeight() + " kg");
    }

}
