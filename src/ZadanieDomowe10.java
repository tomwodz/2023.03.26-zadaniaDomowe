public class ZadanieDomowe10 {
    //*10.Napisac program w którym są 3 zmienne:
    //s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
    //k - liczba całkowita - oznacza krok w ciągu arytmetycznym
    //n - liczba całkowita - oznacza ilość elementów ciągu.
    //Program ma zwracać sumę elementów takiego ciągu. Przykład:
    //s = 3, k = 5, n = 4
    //program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
    //3, 8, 13, 18
    //następnie je sumuje i podaje wynik: 42.
    //Info o tym jak działa ciąg arytmetyczny jest na wikipedii :)*//

    public static void main(String[] args) {

        int s = 3;
        int k = 5;
        int n = 4;;

         //* na talicach *//

        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++){
            tab[i]=s + (((i+1)-1)) * k;
            System.out.println(i+1 + " liczba ciagu: "+tab[i]);
        }
        int sum2 = (n * (s + tab[tab.length-1])) / 2;
        System.out.println("Suma ciagu: " + sum2);

        System.out.println("----------------------------- !!");

        //* na zmienych *//

        int sequence = s;
        int sum = s;

        for (int i= 0; i < n; i++){
            if (i == 0){
                sequence = s;
                System.out.println(i+1 + " liczba ciagu: " + sequence);
            } else {
               sequence = sequence+k;
               System.out.println(i+1 + " liczba ciagu: " + sequence);
               sum = sum + sequence;
            }
        }
        System.out.println("Suma ciagu: "+sum);




    }
}
