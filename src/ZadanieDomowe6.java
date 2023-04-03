public class ZadanieDomowe6 {

    //*6.Wypisz na ekranie liczby od 0 do 99. Jeśli liczba jest podzielna przez 3 obok liczny dopisz "Fizz", jeśli liczba jest podzielna przez 5 obok liczby dopisz "Buzz", jeśli liczba jest podzielna przez 3 i 5 obok liczby dopisz "Fizz Buzz". Przykład:*//
    //*1
    //2
    //3 Fizz
    //4
    //5 Buzz
    //6 Fizz*/

    public static void main(String[] args) {

        int tab[] = new int[100];
        for (int i = 0; i < tab.length; i++){
            tab[i]=i;
            if (tab[i] % 3 == 0 && tab[i] % 5 == 0 ){
                System.out.println(tab[i] + " Fizz Buzz");
            } else if (tab[i] % 3 == 0) {
                System.out.println(tab[i] + " Fizz");
            } else if(tab[i] % 5 == 0){
                System.out.println(tab[i] + " Buzz");
            }
            else {
                System.out.println(tab[i]);
            }
    }

    }
}
