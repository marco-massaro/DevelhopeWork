package javaoopAdvanced.exercises._9;

public class Boat implements Movable {
    @Override
    public String moveForward() {
        return "The boat is forwards!";

    }

    @Override
    public String moveBackward() {
        return "The boat is moving backwards!";
    }
}
