import java.util.Random;

public class ZadanieDomowe13 {
    //*13.Napisz program który symuluje rzuty dwiema kastkami do gry (takie zwykłe białe kości jak w monopoly).
    // Program ma wykonać 10 000 rzutów i wypisać liczbę która wypadała najczęściej (ta liczba jest oczywiście sumą oczek na dwóch kościach które symulujemy.*//

    public static void main(String[] args) {
        Random radom = new Random();

        int k1, k2, sum;

        int[] tab = new int[12];
        for (int i = 0; i < tab.length; i++){
            tab[i] = 0;
        }

        for (int i = 0; i < 10000; i++){
            k1 = radom.nextInt(1,7);
            k2 = radom.nextInt(1,7);
            sum = k1 + k2;

            switch (sum){
                case 1: tab[0]=tab[0]+1;
                    break;
                case 2: tab[1]=tab[1]+1;
                    break;
                case 3: tab[2]=tab[2]+1;
                    break;
                case 4: tab[3]=tab[3]+1;
                    break;
                case 5: tab[4]=tab[4]+1;
                    break;
                case 6: tab[5]=tab[5]+1;
                    break;
                case 7: tab[6]=tab[6]+1;
                    break;
                case 8: tab[7]=tab[7]+1;
                    break;
                case 9: tab[8]=tab[8]+1;
                    break;
                case 10: tab[9]=tab[9]+1;
                    break;
                case 11: tab[10]=tab[10]+1;
                    break;
                case 12: tab[11]=tab[11]+1;
                    break;
            }

        }

        int temp = 0;
        int ktora = 0;

        for (int i = 0; i < tab.length; i++){
            if (tab[i]>temp){
                temp = tab[i];
                ktora = i+1;
            }
        }
        System.out.println("-----\n" + "Najczesciej wylosowano sume: " + ktora + ", az " + temp + " razy.");



    }
}
