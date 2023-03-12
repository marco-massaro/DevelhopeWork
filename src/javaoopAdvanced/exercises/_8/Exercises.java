package javaoopAdvanced.exercises._8;

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
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog = new Dog("Buddy",20,40,"Dachshund");
        System.out.println("Who's a good boy? " + dog.getName());
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish fish = new Fish("Salmon",5,10,"Salmon");
        Bird bird = new Bird("Falcon",10,20,30);
        System.out.println("Here are two different ANIMOLZ: " + "\n" + fish.getName() + "\n"+ bird.getName());
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Fish fish = new Fish("Salmon",5,10,"Salmon");
        Bird bird = new Bird("Falcon",10,20,30);
        Dog dog = new Dog("Buddy",20,40,"Dachshund");
        if (fish.swimSpeedMetersPerSecond() > bird.flySpeedMetersPerSecond() && fish.swimSpeedMetersPerSecond() > dog.runSpeedMetersPerSecond()){
            System.out.println("The fastest animal is " + fish.getName()  + " with a movement speed of " + fish.swimSpeedMetersPerSecond() + " meters per second");
        } else if (bird.flySpeedMetersPerSecond() > dog.runSpeedMetersPerSecond() && bird.flySpeedMetersPerSecond() > fish.swimSpeedMetersPerSecond()){
            System.out.println("The fastest animal is " + bird.getName() + " with a movement speed of " + bird.flySpeedMetersPerSecond() + " meters per second");
        }else {
            System.out.println("The fastest animal is " + dog.getName() + " with a movement speed of " + dog.runSpeedMetersPerSecond() + " meters per second");
        }


    }
}
