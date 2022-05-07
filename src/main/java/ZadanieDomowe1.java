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
        if(liczba <= 1){
            System.out.println("to nie liczba pierwsza");
        } else if(liczba == 2) {
            System.out.println(liczba + " to liczba pierwsza");
        } else if(modulo(liczba) == 0){
            System.out.println(liczba + " to nie liczba pierwsza");
        } else if(jakasMetodaCoSprawdzaCzyLiczbaMaWiecejNizDwaDzielniki(liczba) > 99999){
            System.out.println(liczba + " to nie liczba pierwsza");
        } else{
            System.out.println(liczba + " liczba pierwsza jak najbardziej");
        }
        //System.out.println(lPierwsza(liczba));
    }

    public static int modulo(int a){
        return a % 2;
    }
    public static int jakasMetodaCoSprawdzaCzyLiczbaMaWiecejNizDwaDzielniki(int b){
        for(int i = b; i>=3; i--){
            if((b / i)%2 != 0);
        }
        return b;
    }

}
/*for (int i = 0; i <= 100; i++) {
        if (i % 2 == 0) {
        lista.add(i * 2);
        } else {
        lista.add(i);
        }

        String imie;
        Scanner in = new Scanner(System.in);
        System.out.println("podaj imie: ");
        imie = in.nextLine();

*/