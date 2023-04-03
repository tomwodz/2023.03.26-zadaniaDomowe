import java.util.Random;

public class ZadanieDomowe5 {
    public static void main(String[] args) {
        //* 5.Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb. Wynikiem działania programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5. Zakres losowych liczb 0 - 10. *//
        Random random = new Random();
        int[] tab = new int[10];
        int ile = 0;
        for (int i = 0; i < tab.length; i++){
            tab[i] = random.nextInt(11);
            if (tab[i] == 5){
                ile++;
            }
        System.out.print(tab[i] + " ");
        }

        System.out.println();
        System.out.println("----------------------------- !!");
        System.out.println("Liczba 5 wylosowała się: " + ile + " raz/y.");


    }
}
