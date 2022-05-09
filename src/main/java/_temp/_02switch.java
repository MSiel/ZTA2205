package _temp;

import java.util.Scanner;

public class _02switch {
    public static void main(String[] args) {
        String kolor;
        Scanner skan = new Scanner(System.in);
        System.out.println("kolor?");
        kolor = skan.nextLine();

        String odpow = "kolor: ";

        switch (kolor) {
            case "bialy" :
                System.out.println("kolor " + kolor);
                break;
            case "czarny" :
                System.out.println("kolor " + kolor);
                break;
            case "niebieski" :
                odpow += kolor;
                break;
            default :
                System.out.println("elo");
                break;

        }
        System.out.println(odpow);
    }
}
