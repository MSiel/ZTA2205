import java.util.Scanner;

/*
CZY WPISANA LICZBA JEST LICZBA PIERWSZA- napisz metode

dodatkowo
- osobna metoda do odczytywania danych od uzytkownika
- dodaj obsluge wyjatkow przy braku danych
- zapetl program - komenda 'exit' powoduje zakonczenie programu
 */
public class ZadanieDomowe1 {
    public static void main(String[] args) {

        int liczba;
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczbe: ");
        liczba = in.nextInt();
        if (liczba <= 1) {
            System.out.println("1 to nie liczba pierwsza");
        } else if (liczba == 2) {
            System.out.println("2 to liczba pierwsza");
        } else if (czyPodzielnaPrzez2(liczba) == 0) {
            System.out.println(liczba + " jest podzielna przez 2 - to nie liczba pierwsza");
        } else if (czyWiecejNiz1Dzielnik(liczba) == true) {
            System.out.println(liczba + " to liczba pierwsza, jak najbardziej");
        } else {
            System.out.println(liczba + " to nie liczba pierwsza--ostatni warunek");
        }

    }

    public static int czyPodzielnaPrzez2(int a) {
        return a % 2;
    }

    public static boolean czyWiecejNiz1Dzielnik(int b) {

        int k = 0;
        boolean wynik = false;

        for (int i = b; i > 2; i--) {
            if (b % i == 0) {
                k++;
                if (k > 1) {
                    wynik = false;
                    break;
                }
            }
        }

        if (k == 1) {
            wynik = true;
        }

        return wynik;
    }

}