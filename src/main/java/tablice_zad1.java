import java.util.Scanner;

public class tablice_zad1 {
    public static void main(String[] args) {
        String[] tablica = new String[5];  //ilosc elementow tablicy - 5, indeksy od 0 do 4
        // -- tablice indeksujemy od 0
        Scanner in = new Scanner(System.in);

        //petla 1 - zbiera dane z inputu usera
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("podaj " + (i + 1) + " imie");
            tablica[i] = in.nextLine();                         //zgodnosc typow z tablica --nextLine - do tekstu
        }

        //petla 2 - pokazuje elementy tablicy
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
