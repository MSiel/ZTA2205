import java.util.ArrayList;
import java.util.List;

/*Stwórz listę liczb od 0 do 100. Pomnóż liczby parzyste przez 2.
Wydrukuj listę na konsoli.
*/
//sprawdzanie czy liczba parzysta
public class lista_zad1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();   // nie może być int -- tu potrzeba typu komplementarnego -- Integer

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                lista.add(i * 2);
            } else {
                lista.add(i);
            }
            System.out.println(lista.get(i));
        }

        //for (int i = 0; i <= 100; i++) {
       //     System.out.println(lista.get(i));
       // }

        // wersja z wykorzystaniem petli FOREACH
        List<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i <= 100; i++)
            lista2.add(i);

        for(int v : lista2)
                if (v % 2 == 0)
            lista2.set(v, v * 2);

        for(int v : lista2){
            System.out.println(v);
        }

    }
}
// sprawdzanie wielkosci tablicy vs wielkosci listy
// tablica.length
// lista.size