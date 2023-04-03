import java.util.Random;

public class ZadanieDomowe4 {
    public static void main(String[] args) {
        //* 4.Napisz program generujący jednowymiarową tablicę (10 elementów) liczb w której każda liczba jest losowa ale nie jest mniejsza niż poprzednia liczba. Przykłady:
        //23, 34, 53, 60, 80
        //0, 10, 70, 70, 70
        //nieprawidłowy wynik:
        //34, 56, 34, 78, 99 - trzecia liczba jest mniejsza niż poprzednia (druga).
        //Wynikiem działania programu ma być wyświetlona wygenerowana tablica. Zakres losowych liczb 0 - 20. *//

        Random random = new Random();
        int [] tab = new int [10];
        int tempMax = -1;
        for (int i = 0; i < tab.length ; i++){
            do {
            tab [i] = random.nextInt(21);
            }
            while (tab[i] < tempMax);
            tempMax = tab[i];

            System.out.print(tab[i] + " ");
        }
    }
}
