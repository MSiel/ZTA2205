public class dz2_01_klasy_z1_firmaPracownik1
{
    public static void main(String[] args) {
        Pracownik1 programista1;
        Pracownik1 kontroler1;

        programista1 = new Pracownik1(); //nastepny programist to bylby np programista2
        kontroler1 = new Pracownik1();

        programista1.imie = "Adam";
        programista1.nazwisko = "Adamowski";
        programista1.wiek = 22;

        kontroler1.imie = "Kasia";
        kontroler1.nazwisko = "Kasinska";
        kontroler1.wiek = 24;

        System.out.println(programista1.imie +" "+ programista1.wiek);
    }
}

class Pracownik1{
    String imie;
    String nazwisko;
    int wiek;
}

/*
class Firma{
    Pracownik1 programista;
    Pracownik1 kontroler;
}*/
