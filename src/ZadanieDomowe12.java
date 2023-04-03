import java.util.Scanner;

public class ZadanieDomowe12 {
    //*12.Napisz program który ma dwie zmienne:
    //weight - waga, liczba całkowita
    //height - wzrost, liczba całkowita
    //program ma obliczać BMI (wskaźnik masy ciała, wzór do znalezienia w internecie, gdybyście nie znaleźli to piszcie) i na podstawie wyliczonego BMI wypisywać "Nadwaga, Niedowaga, W normie itp.*//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoja wage w kg:");
        double wegiht  = scanner.nextDouble();
        System.out.println("Podaj swoj wzrost w cm");
        double height = scanner.nextDouble();

        height = height /100 ;
        double bmi = wegiht / (Math.pow(height,2) );

        String b;

        if (bmi < 16){
          b = "Wgłodzenie";}
        else if(bmi >= 16 && bmi < 16.99){
            b = "Wychudzenie";}
        else if(bmi >= 16.99 && bmi < 18.49){
            b = "Niedowaga";}
        else if (bmi >= 18.49 && bmi < 24.99){
            b = "Waga prawidlowa";}
        else if (bmi >= 24.99 && bmi < 29.99){
            b = "Nadwaga";}
        else if (bmi >= 29.99 && bmi < 34.99){
            b = "I stopien otylosci";}
        else if (bmi >= 34.99 && bmi < 39.99){
            b = "II stopien otylosci";}
        else {
            b ="III stopien otylosci";}

        System.out.println("Dla podanej wagi: " + wegiht + " kg i wzrotu: " + height + " cm BMI wynosi: " + String.format("%.2f", bmi) + " " + b);

    }
}

