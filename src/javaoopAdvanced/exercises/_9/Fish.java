package javaoopAdvanced.exercises._9;

public class Fish extends Animal{

    public Fish(double height, double weight, String name) {
        super(height, weight, name);
    }

    @Override
    double calculateMovementSpeedMetersPerSecond() {
        return getWeight() * 2;
    }

    @Override
    public String soundOfNoise() {
        return "Blub blub";
    }

    @Override
    public double getDecibelsOfNoise() {
        return 0;
    }
}
