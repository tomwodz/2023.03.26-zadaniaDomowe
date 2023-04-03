import java.util.Random;

public class ZadanieDomowe9 {
   //*Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
    // Wynikiem działania programu mają być wypisane obie tablice, oraz trzecia tablica w które każdy element jest sumą odpowiadających elementów z dwóch pierwszych tablic. *//

    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        int[] tab2 = new int[tab.length];
        int[] sumTabTab2 = new int[tab.length];

        for (int i = 0; i < tab.length; i++){
            tab[i]= random.nextInt(101);
            tab2[i]= random.nextInt(101);
            sumTabTab2[i]= tab[i] + tab2[i];
        }

        System.out.println("Tablica 1: \n-------------------------------- !!");

        for (int element : tab){
            System.out.print(element + " ");
        }


        System.out.println("\n\nTablica 2:  \n-------------------------------- !!");

        for (int element : tab2){
            System.out.print(element + " ");
        }
        System.out.println("\n\nTablica 1 + Tablica 2:  \n-------------------------------- !!");

        for (int element : sumTabTab2){
            System.out.print(element + " ");
        }



    }
}

