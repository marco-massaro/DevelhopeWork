package shared;

import java.util.Objects;
import java.util.Set;

public class Meal {
    private Double price;
    private Integer weightInGrams;
    private Set<Ingredient> ingredients;

    public Meal(Double price, Integer weightInGrams, Set<Ingredient> ingredients) {
        this.price = price;
        this.weightInGrams = weightInGrams;
        this.ingredients = ingredients;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(Integer weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "price=" + price +
                ", weightInGrams=" + weightInGrams +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meal meal)) return false;
        return Objects.equals(getWeightInGrams(), meal.getWeightInGrams());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeightInGrams());
    }
}
