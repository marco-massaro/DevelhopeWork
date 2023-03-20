package javaoopAdvanced.exercises._9;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        super(radius , radius);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
