package javaoopAdvanced;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Double> ourMealPrices = new HashMap<>();
        ourMealPrices.put("Pizza", 10.0);
        ourMealPrices.put("Pizza", 10.0);
        ourMealPrices.put("Salad", 8.0);
        ourMealPrices.keySet();
        for (String mapkey : ourMealPrices.keySet()) {
            System.out.println("Our current key is " + mapkey);
        }
        for (Double mapValue : ourMealPrices.values()) {
            System.out.println("Our current value is " + mapValue);
        }
        for (Map.Entry<String, Double> entry : ourMealPrices.entrySet()) {
            System.out.println("Our current key is " + entry.getKey() + " and our current value is " + entry.getValue());
        }
    }
}
