import java.util.Random;

public class ZadanieDomowe14 {
    //*14.Napisz program który generuje tablicę liczb 0 i 1 (10 elementów).
    // Program ma sprawdzić czy tablica jest symetryczna - pierwszy element taki jak ostatni, drugi taki jak przedostatni itd.
    // Wynikiem działania programu ma być wypisana wygenerowana tablica oraz true albo false w zależności czy jest symetria czy nie.*//

    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        boolean[] sym = new boolean[tab.length];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(0, 2);
            sym[i] = false;
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == tab[(tab.length - 1) - i]) {
                sym[i] = true;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " | " + sym[i]);
        }
    }

}
