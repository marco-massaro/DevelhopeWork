package shared;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        Map<String, Meal> menu = generateMenu();
        List<Meal> orders = generateOrders(menu);
        String fileContent = convertOrdersToCsvContent(orders);
        Path ordersCsvPath = Path.of("orders.csv");
        writeToFile(fileContent,ordersCsvPath);


    }

    private static void writeToFile(String fileContent, Path orderPath) {
        try {
            Files.writeString(orderPath , fileContent);
        }catch (Exception e) {
            System.err.println("There was an error");
            System.exit(0);
        }
    }

    private static String convertOrdersToCsvContent(List<Meal> orders) {
        StringBuilder fileContentBuilder = new StringBuilder();
        fileContentBuilder.append("Price, Weight in grams");

        for (Meal order : orders) {
            fileContentBuilder.append("\n").append(order.getPrice()).append(",")
                    .append(order.getWeightInGrams()).append("\n");

        }
        return fileContentBuilder.toString();
    }

    private static List<Meal> generateOrders(Map<String, Meal> menu) {
        List<Meal> orders = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            orders.add(menu.get(new ArrayList<>(menu.keySet()).get(RANDOM.nextInt(menu.size()))));
        }
        return orders;
    }

    private static Map<String, Meal> generateMenu() {
        Map<String, Meal> menu = new HashMap<>();

        menu.put("Burger", new Meal(7.80,500, Set.of("Bun","Patty","Sauce")));
        menu.put("Cheese Burger", new Meal(7.80,500, Set.of("Bun","Patty","Sauce","Cheese single")));
        menu.put("Fries", new Meal(3.50,250, Set.of("Potato","Lots of oil")));
        menu.put("Pizza", new Meal(10.00,700, Set.of("Dough","Cheese", "Tomato","Toppings")));
        return menu;
    }

}
