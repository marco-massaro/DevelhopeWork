package javabasics._6;
public class Main {
    public static void main(String[] args) {
        int lunchPriceEuros = 20;
        int sandwichPriceEuros = 3;
        int  remainingMoneyAfterBuyingAsManySandwichesAsPossible = lunchPriceEuros % sandwichPriceEuros;

        System.out.println("Our total lunch price is " + lunchPriceEuros + " euros, after buying as many sandwiches as possible" +
                ", we have " + remainingMoneyAfterBuyingAsManySandwichesAsPossible + " euros left");

    }
}