public class ZadanieD1_tmp {
    public static void main(String[] args) {
        int b = 3;
        int k = 0;
        boolean wynik = false;

        for(int i = b; i > 2; i--){
            if((b / i) % 2 == 0){
                k++;
                if(k > 2){
                    break;
                }
            }
        }

        if (k == 2){
            wynik = true;
        }
    }
}
