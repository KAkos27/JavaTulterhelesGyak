package gyakorlas;

import java.util.Random;

public class Gyakorlas {

    static Random rnd = new Random();

    public static void main(String[] args) {
        equalizerMeghivasa();
    }

    private static void equalizerMeghivasa() {
        equalizer();
        equalizer(true);
        equalizer(false);
        equalizer(1);
        equalizer(2, true);
        equalizer(3, false);
    }

    private static void equalizer() {
        equalizer(false);
    }

    private static void equalizer(int fixMennyiseg) {
        equalizer(fixMennyiseg, false);
    }

    private static void equalizer(boolean hanyDb) {
        int mennyiseg = rnd.nextInt(3, 8);
        equalizer(mennyiseg, hanyDb);
    }

    private static void equalizer(int fixMennyiseg, boolean hanyDb) {
        for (int i = 0; i < fixMennyiseg; i++) {
            System.out.print("*");
        }
        if (hanyDb) {
            System.out.printf(" (%3d db)", fixMennyiseg);
        }
        System.out.println("");
    }
}
