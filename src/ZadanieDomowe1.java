import java.util.Random;

// Sortowanie przez wybieranie

public class ZadanieDomowe1 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        System.out.println("Tablica  z losowaymi liczbami:");

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        System.out.println("--------------------------------------------------------- !!");
        System.out.println();

        for (int i = 0; i < tab.length - 1; i++) {
            int min = tab[i];

            for (int j = i + 1; j < tab.length; j++) {

                if (tab[j] < tab[i]) {
                    min = tab[j];
                    int temp = tab[i];
                    tab[i] = min;
                    tab[j] = temp;
                }
            }

            int x = i + 1;
            System.out.print("Po przebiegu " + x + ": ");

            for (int element : tab) {
                System.out.print(element + " ");
            }

            System.out.println();

        }

        System.out.println();
        System.out.println("Tablica  z posortowanymi liczbami:");
        System.out.println("--------------------------------------------------------- !!");

        for (int element : tab) {
            System.out.print(element + " ");
        }


    }
}