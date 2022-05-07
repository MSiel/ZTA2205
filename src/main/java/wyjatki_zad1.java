public class wyjatki_zad1 {
    public static void main(String[] args) {
        /*[15:49:57] Adam Toczek EXT
Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę.
Napisz pętlę, która wyjdzie poza długość tablicy.
Przechwyć wyjątek ze stosownym komunikatem.
*/
        int[] tab ={3,8,4,7,2};
     //   for(int i = 0; i <= tab.length; i++){
      //      System.out.println(tab[i]);
      //  }

        try{
            for(int i = 0; i <= tab.length; i++){
                System.out.println(tab[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("WYJATEK");
            System.out.println(e.getMessage());
        }
    }
}
