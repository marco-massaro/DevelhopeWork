package shared;

import java.util.Set;

public class MealMain {
    public static void main(String[] args) {
        Meal normalMeal = new Meal(7.5,500, Set.of(Ingredient.DOUGH,Ingredient.OIL));
        HospitalMeal hospitalMeal = new HospitalMeal(600, Set.of(Ingredient.TOMATO),Set.of(DietaryRequirement.NO_GLUTEN));
        AirplaneMeal airplaneMeal = new AirplaneMeal(11.40,400, Set.of(Ingredient.PATTY, Ingredient.TOMATO), true);

        System.out.println(normalMeal.getPrice());
        System.out.println(hospitalMeal.getDietaryRequirements());
        System.out.println(airplaneMeal.isFirstClassExclusive());

    }
}
