package javaoop.exercises._3;

public class Student {
    private String name = null;
    private Integer age = null;
    private Integer height = null;
    private Integer weight = null;
    private String lastName = null;
    private static int minimumAge = 10;
    private Integer ageCheck = 0;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        if (age < minimumAge) {
            System.out.println("This student should be playing with blocks");
        } else {
            System.out.println("this student should be studying coding");

        }
        this.age = age;
    }

    public int getAgeCheck() {
        return ageCheck;
    }



    public int getAge() {
        ageCheck++;
        return age;
    }

    public int getHeight() {
        System.out.println("This person's height in cm is: ");
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        if (height > 180) {
            System.out.println("Please play basketball if");
        } else {
            System.out.println("Continue coding if ");
        }
        this.height = height;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight > 200) {
            System.out.println("Please go on a diet if ");
        } else {
            System.out.println("You are probably not overweight if");
        }
        this.weight = weight;
    }

}
