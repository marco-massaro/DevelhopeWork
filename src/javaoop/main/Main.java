package javaoop.main;

public class Main {
    public static void main(String[] args) {
        Lunch todaysLunch = new Lunch();
        Lunch tomorrowsLunch = new Lunch();



        todaysLunch.nameOfDayEaten = "Sunday";
        printLunch(todaysLunch);
        printLunch(tomorrowsLunch);
        todaysLunch.price = 100;

    }
    static void printLunch(Lunch lunch) {
        if (lunch.nameOfDayEaten == null) {
            System.out.println("lunch name is null, cannot print");
        }else {
            System.out.println("Lunch price is " + lunch.price + ", name of day = " + lunch.nameOfDayEaten.toLowerCase());
        }

    }
}
