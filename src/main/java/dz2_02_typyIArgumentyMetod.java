/*
Do utworzonej poprzednio klasy Pracownik dopisz metody zwracające poszczególne pola.
 Ponadto dodaj metodę pobierzDane(),która nie będzie zwracać wartości
  a jedynie wypisze na konsoli wszystkie dane pracownika.
*/

public class dz2_02_typyIArgumentyMetod {
    public static void main(String[] args) {
        Pracownik programista1;
        Pracownik kontroler1;
        Pracownik glazurnik1;

        programista1 = new Pracownik(); //nastepny programist to bylby np programista2
        kontroler1 = new Pracownik();
        glazurnik1 = new Pracownik();

//patrz gettery w definicji klasy
        programista1.imie = "Adam";
        programista1.nazwisko = "Adamowski";
        programista1.wiek = 22;

        kontroler1.imie = "Kasia";
        kontroler1.nazwisko = "Kasinska";
        kontroler1.wiek = 24;

//patrz settery w definicji klasy
        glazurnik1.setImie("Boguslaw");
        glazurnik1.setNazwisko("Lecina");
        glazurnik1.setWiek(45);

//        System.out.println(programista1.imie +" "+ programista1.wiek);

        programista1.wyswietlDane();
        kontroler1.wyswietlDane();
        glazurnik1.wyswietlDane();
    }
}
class Pracownik{
    String imie;
    String nazwisko;
    int wiek;

    public void wyswietlDane() {
        System.out.println("Pracownik: "+imie+" "+nazwisko+"\t"+wiek+" lat");
    }
// gettery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }
// settery
    public void setWiek (int wiek){
       this.wiek = wiek;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}