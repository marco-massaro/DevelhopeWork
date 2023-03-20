package javaoopAdvanced.exercises._12;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<WaterBottle> waterBottles = Set.of(
                new WaterBottle(1_000, "Bronze"),
                new WaterBottle(2_000, "red"),
                new WaterBottle(500, "blue"),
                new WaterBottle(750, "Bronze")
        );
        javaStreamsFiltering(waterBottles);
    }

    private static void javaStreamsFiltering(Set<WaterBottle> waterBottles) {
        //collection -> stream -> collect -> collection
        System.out.println("You have " + waterBottles.stream().filter( waterBottle -> waterBottle.color().equals("Bronze"))
                .map(waterBottle -> waterBottle.capacityInML()).collect(Collectors.toSet()));
    }

}
