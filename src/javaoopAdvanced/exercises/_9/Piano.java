package javaoopAdvanced.exercises._9;

public class Piano extends Instrument {
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("The piano goes: Pling pling plong");
    }

}
