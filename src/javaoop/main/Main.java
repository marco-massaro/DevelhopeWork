package javaoop.main;

public class Main {
    public static void main(String[] args) {
        Lunch todaysLunch = new Lunch(3.99,"Sunday");
        Lunch tomorrowsLunch = new Lunch(7.50, "Monday");


        todaysLunch.printLunch();
        tomorrowsLunch.printLunch();

    }
}
