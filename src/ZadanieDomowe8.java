import java.util.Arrays;
import java.util.Random;

public class ZadanieDomowe8 {
    //8.Napisz program który generuje dwie tablice (10 elementów) losowych liczb. Wynikiem działania programu mają być wyświetlone obie tablice oraz trzecia tablica będąca połączeniem dwóch wygenerowanych. Przykład:
    //3, 5, 12, 34, 45
    //45, 21, 65, 23, 1
    //3, 5, 12, 34, 45, 45, 21, 65, 23, 1*//

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Wersja 1.1");

        int[] aTab = new int[10];
        int[] aTab2 = new int[aTab.length];
        int[] aTab3 = new int[aTab.length + aTab2.length];

        for (int i = 0; i < aTab.length; i++){
            for (int j = 0; j <2; j++){
                if( j == 0){
                    aTab[i]= random.nextInt(101);
                } else if(j == 1)
                    aTab2[i] = random.nextInt(101);
            }
        }

        System.arraycopy(aTab, 0, aTab3, 0,aTab.length);
        System.arraycopy(aTab2, 0, aTab3, aTab.length, aTab2.length);

        System.out.println(Arrays.toString(aTab));
        System.out.println(Arrays.toString(aTab2));
        System.out.println(Arrays.toString(aTab3));


        System.out.println();
        System.out.println("------------------------------------------ !!");
        System.out.println("Wersja 1");

        int[] tab = new int[10];
        int[] tab2 = new int[tab.length];
        int[][] tab3 = new int[2][tab.length];

        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j <2; j++){
                if( j == 0){
                    tab3[j][i] = tab[i]= random.nextInt(101);
                } else if(j == 1)
                    tab3[j][i] = tab2[i] = random.nextInt(101);

            }
        }

        System.out.println("Tablica 1: \n-------------------------------- !!");

        for (int element : tab){
            System.out.print(element + " ");
        }


        System.out.println("\n\nTablica 2:  \n-------------------------------- !!");

        for (int element : tab2){
            System.out.print(element + " ");
        }

        System.out.println("\n\nTablica ALL:  \n-------------------------------- !!");

        for (int j = 0; j < 2; j++){
            for (int i = 0; i < tab.length; i++){
                System.out.print(tab3[j][i] + " ");
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(tab3));


    }

}
