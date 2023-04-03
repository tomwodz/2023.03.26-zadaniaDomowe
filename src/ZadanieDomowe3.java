import java.util.Random;

public class ZadanieDomowe3 {
    public static void main(String[] args) {
        //*3.Napisz program generujący dwuwymiarową tablice (5x5) losowych liczb. Wynikiem działania programu ma być wyświetlona tablica oraz najmniejsza liczba z tej tablicy. Zakres losowych liczb 0 - 100.*//
        Random random = new Random();

        int[][] tab = new int[5][5];

        int tempMin = 100;
        for (int row = 0; row < tab.length; row++) {
            for (int col = 0; col < tab[row].length; col++){
            tab[row][col] = random.nextInt(101);
                System.out.print(tab[row][col] + " ");
                if (tempMin >= tab[row][col]) {
                tempMin = tab[row][col];
                }
            }
            System.out.println();
        }

        System.out.println("---------------------------- !!");
        System.out.println("Najmniejsza liczba z talibcy to: ");
        System.out.println(tempMin);







    }
}
