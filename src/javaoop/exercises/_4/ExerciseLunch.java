package javaoop.exercises._4;

public class ExerciseLunch {
    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;
    private static final String NOT_A_DAY = "";
    private static final int MINIMUM_WEIGHT_GRAMS = 400;
    private static final double MAX_PRICE = 5;
    private static final double MIN_PRICE = 2;

    private int numberOfTimesWeHaveGotPrice = 0;

    public ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public static void printMaxPrice() {
        System.out.println(MAX_PRICE);
    }

    private void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    private void setPrice(double price) {
        if (price > MAX_PRICE) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }

    public Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }

    private int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    public String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    private int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    public void setPrice(Double price) {
        if(price < MIN_PRICE){
            System.out.println("Spend more money, brokey");
        } else if (price > MAX_PRICE) {
            System.out.println("Spend less money, richboy");
        } else{
            this.price = price;
        }
    }

    public void setNameOfDayEaten(String nameOfDayEaten) {
        if(nameOfDayEaten.equals(NOT_A_DAY)){
            System.out.println("Not a valid day please retry");

        }else {
            this.nameOfDayEaten = nameOfDayEaten;
        }

    }

    public void setLunchWeightInGrams(int lunchWeightInGrams) {
        if(lunchWeightInGrams < MINIMUM_WEIGHT_GRAMS){
            System.out.println("Below required weight. Order a fatter piece of meat");
        }else{
            this.lunchWeightInGrams = lunchWeightInGrams;
        }
    }

    private void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }
}
