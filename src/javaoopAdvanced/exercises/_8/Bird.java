package javaoopAdvanced.exercises._8;

public class Bird extends Animal{

    private Double wingSpan;
    public Bird(String name, double height, double weight, double wingSpan) {
        super(height, weight,name);
        this.wingSpan = wingSpan;
    }

    public Double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public double flySpeedMetersPerSecond(){
        return getWingSpan() * 4;
    }
}
