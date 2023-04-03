import java.util.Scanner;

public class ZadanieDomowe11
//*11.Napisz program który ma 3 zmienna a, b i c. Te zmienne to długości boków trójkąta.
// Program ma sprawdzić czy z podanych boków da się zbudować trójkąt.
// Jeśli się da to program ma wypisać na ekranie true (w przeciwnym wypadku false) i obliczyć obwód tego trójkąta.
// Jak sprawdzić czy z podanych boków da się zbudować trójkąt znajdziecie w google pod hasłem: "Nierówność trójkąta".*//
        {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj pierwszy bok trojkata:");
                int a = scanner.nextInt();
                System.out.println("Podaj drugi bok trojkata:");
                int b = scanner.nextInt();
                System.out.println("Podaj trzeci bok trojkata:");
                int c = scanner.nextInt();
                System.out.println("Podane boki trojkta to: " + a + "," + b +"," + c +",\n");

                boolean ineq = false;

                //* Długość każdego odcinka, z którego ma być zbudowany trójkąt musi być krótsza od sumy pozostałych dwóch odcinków!!! //*

                System.out.println("Czy z ww. bokow mozna zbudowac tojkat?");

                if (a < b + c && b < a + c && c < a + b){
                    ineq = true;
                    System.out.println(ineq);
                    int cir = a + b + c;
                    System.out.print("\nObwod trojkata wynosi: " + cir);
                } else {
                    System.out.println(ineq);
                }




            }
}
