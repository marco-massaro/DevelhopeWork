package javaoopAdvanced.exercises._9;

public class Guitar extends Instrument {
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("The guitar goes: Strum strum strum");
    }
}
