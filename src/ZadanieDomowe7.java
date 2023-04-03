import java.util.Random;

public class ZadanieDomowe7 {
    //* 7.Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
    // Program ma wygenerować druga tablicę która jest pierwszą tablicą w odwrotnej kolejności.
    // Wynikiem działania programu ma być wyświetlona pierwsza i druga tablica.
    // Przykłady:Zakres losowych liczb 0 - 100.*//

    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        int[] tabPivot = new int[tab.length];

        for ( int i = 0; i < tab.length; i++){
            tab[i] = random.nextInt(101);
            tabPivot[(tab.length-1)-i] = tab[i];
        }

        System.out.println("Tablica losowa:");
        System.out.println("----------------------- !!");
        for (int element : tab){
            System.out.print(element + " ");
        }

        System.out.println("\n\nTablica przestawna:");
        System.out.println("----------------------- !!");
        for (int element : tabPivot){
            System.out.print(element + " ");
        }

    }


}
