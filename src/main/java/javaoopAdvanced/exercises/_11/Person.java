package javaoopAdvanced.exercises._11;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "Their name is '" + name +
                ", they are " + age + " years old " + "and they live at " +
                 address;
    }
}



//public class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
