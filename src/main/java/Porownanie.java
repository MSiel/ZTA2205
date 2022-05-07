import java.util.Scanner;

public class Porownanie {
 /*   public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();

        if(a >= b)
            System.out.println("Liczba a jest wieksza od b");
        else
            System.out.println("a jest mniejsze od b");
    }*/
 public static void main(String[] args) {
     int a;
     int b;

     Scanner in = new Scanner(System.in);

     System.out.println("podaj a: ");       //system prosi o podanie a
     a = in.nextInt();                      // przypisanie tego co wpisal user do zmiennej a

     System.out.println("podaj b: ");       //system prosi o podanie a
     b = in.nextInt();                      // przypisanie tego co wpisal user do zmiennej a

     if(a > b)
         System.out.println("a wieksze od b");
     else if (a == b)
         System.out.println("a = b");
     else
         System.out.println("a mniejsze od b");
 }
}
//skróty:
// sout
// main