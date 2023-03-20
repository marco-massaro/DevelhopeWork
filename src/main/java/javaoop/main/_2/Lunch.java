package javaoop.main._2;

public class Lunch {
    Double price = null;
    String nameOfDayEaten = null;
    int lunchWeightInGrams;

    static Double maxLunchPrice = 5.50;

    Lunch(Double price, String nameOfDayEaten){
        System.out.println("we ran our constructor1 here");
        if (price >= maxLunchPrice){
            System.out.println("Warning! Exceeded max lunch price. Not setting.");
        }else {
            System.out.println("Lunch price is okay. Setting now.");
            this.price = price;
        }
        this.lunchWeightInGrams = 50;

        this.nameOfDayEaten = nameOfDayEaten;
    }


    public void printLunch() {
        System.out.println("Lunch " + "price = " + price + ", nameOfDayEaten = '" + nameOfDayEaten + '\'' + ", lunch Weight in grams = "
                + lunchWeightInGrams );
    }
}
