import java.util.Scanner;

public class switch_zad2 {
    public static void main(String[] args) {
        String owoc;
        Scanner in = new Scanner(System.in);
        System.out.println("podaj owoc: ");
        owoc = in.nextLine();            // string!



        switch (owoc) {
            case "Jablko":
                // tak samo obsluzony kejs - nie musimy powielac. wystarczy wpisac w ostatnim kejsie
            case "Banan":
                // jw
            case "Pomarancza":

                int waga;
                // Scanner in = new Scanner(System.in);    ---- juz niepotrzebne
                System.out.println("podaj waga: ");
                waga = in.nextInt();            // int!

                System.out.println(owoc + ": " + waga + "kg");
                if (waga > 100)
                    System.out.println("za duzo...");
                else
                    System.out.println("doskonale");
                break;
            default:
                System.out.println("nie znaju");
        }
    }
}
