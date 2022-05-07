import java.util.Scanner;

public class switch_zad1 {
    public static void main(String[] args) {
        String imie;
        Scanner in = new Scanner(System.in);
        System.out.println("podaj imie: ");
        imie = in.nextLine();

        String odpowiedz = "Czesc, ";

        switch (imie) {
            case "Ania":
                System.out.println(odpowiedz + "Ania");
                break;
            case "Monika":
                System.out.println(odpowiedz + "Monika");
                break;
            case "Ewelina":
                System.out.println(odpowiedz + "Ewelina");
                break;
            default:
                System.out.println(odpowiedz + imie + ". Nie znam Cie");
        }
    }
}
