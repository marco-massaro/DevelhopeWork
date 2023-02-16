package javaoop.exercises._2;

public class Student {
        String name;
        int age;
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    Student(Integer age, String name){
        System.out.println("Constructor1");
        System.out.println("Constructing!");
        this.age = age;
        this.name = name;
        System.out.println("Constructed!");
    }
    Student(Integer age){
        System.out.println("Constructor2");
        System.out.println("Constructing!");
        this.age = age;
        System.out.println("Constructed!");
    }
    Student(String name){
        System.out.println("Constructor3");
        System.out.println("Constructing!");
        this.name = name;
        System.out.println("Constructed!");
    }
    Student(){
        System.out.println("Constructor4");
        System.out.println("Constructing!");
        System.out.println("Constructed!");
    }

}
