import java.util.Scanner;

public class petla_zad1 {
    public static void main(String[] args) throws InterruptedException {

        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("ile sekund: ");
        i = in.nextInt();

        //petla FOR
        for (int odl = i; odl > 0; odl--) {
            System.out.println("wybuch za " + odl + " sek");
            Thread.sleep(1000);
        }
        System.out.println("bum");

        //petla WHILE
        while (i > 0) {
            System.out.println("wybuch za " + i + " sek");
            i--;
            Thread.sleep(1000);
        }
        System.out.println("bum");

    }
}
