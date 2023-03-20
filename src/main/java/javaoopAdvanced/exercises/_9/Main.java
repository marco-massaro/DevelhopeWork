package javaoopAdvanced.exercises._9;

public class Main {
    public static void main(String[] args) {
        makeNoise(new Bird(0,0,"0",0));
//        makeNoise(new Car());
        makeNoise(new Fish(0,0,"salmon"));
    }
    private static void makeNoise(NoiseMaker noisemaker){
        System.out.println(noisemaker.soundOfNoise());
    }
}
