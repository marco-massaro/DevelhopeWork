package javaoopAdvanced.exercises._6;

public enum Ingredient {
        BUN(0.2), PATTY(1.5), SAUCE(0.1), CHEESE(0.05), DOUGH(0.02), TOMATO(0.07), POTATO(.05), OIL(.1);

        private double price;
        private boolean isVegetarian;

        Ingredient(double price) {
                this.price = price;
        }

        public double getPrice() {
                return price;
        }
}
