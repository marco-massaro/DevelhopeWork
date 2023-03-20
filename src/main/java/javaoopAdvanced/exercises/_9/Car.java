package javaoopAdvanced.exercises._9;

import org.junit.jupiter.api.DisplayNameGenerator;

public class Car implements Movable {
//    @Override
//    public String soundOfNoise() {
//        return "Vroom";
//    }

//    @Override
//    public double getDecibelsOfNoise() {
//        return 0;
//    }

    @Override
    public String moveForward() {
        return "The car is moving forwards!";
    }

    @Override
    public String moveBackward() {
        return "The car is moving backwards!";
    }
}
