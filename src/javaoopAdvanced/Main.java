package javaoopAdvanced;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> ingredientsList = new HashSet<>();
        ingredientsList.add("Tomato");
        ingredientsList.add("Lettuce");
        ingredientsList.add("Salad dressing");

        for (String ingredient : ingredientsList){
            System.out.println(ingredient);
        }
    }
}
