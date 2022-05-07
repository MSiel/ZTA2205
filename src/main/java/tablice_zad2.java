import java.util.Scanner;

public class tablice_zad2 {
    public static void main(String[] args) {
        int iloscElem;
        Scanner in = new Scanner(System.in);
        System.out.println("podaj ilosc elementow tablicy: ");
        iloscElem = in.nextInt();
        int[] tablica = new int[iloscElem];

        //petla 1 - zbiera dane z inputu usera
        for (int i = 0; i < tablica.length; i++) {               //tablice indeksuje sie od 0
            tablica[i] = i * 2;
        }

        //petla 2 - pokazuje elementy tablicy
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
