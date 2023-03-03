package shared;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Meal> menu = new HashMap<>();
        Meal beefBurger = new Meal(7.80, 500, Set.of("Bun", "Patty", "Sauce"));
        Meal cheeseBurger = new Meal(7.80, 500, Set.of("Bun", "Patty", "Sauce", "Cheese single"));

        menu.put("Burger", beefBurger);
        menu.put("Cheese Burger", cheeseBurger);
        menu.put("Fries", new Meal(3.50,250, Set.of("Potato","Lots of oil")));
        menu.put("Pizza", new Meal(10.00,700, Set.of("Dough","Cheese", "Tomato","Toppings")));

        Set<Meal> burgers = new HashSet<>();
        burgers.add(beefBurger);
        burgers.add(cheeseBurger);

        printOutMealPrices(burgers);
        System.out.println("Then lists \n\n");
        List<Meal> orders = new ArrayList<>();
        orders.add(beefBurger);
        orders.add(beefBurger);
        printOutMealPrices(orders);
    }
    private static void printOutMealPrices(Collection<Meal> ourMeals){
        for (Meal ourMeal : ourMeals){
            System.out.println(ourMeal);
        }
    }
}
