public class Kalkulator {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println(add(x, y));
        System.out.println(substract(10, 2));
        System.out.println(multiply(2, 5));
        System.out.println(divide(10, 2));
    }

    // METODY:
    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return b - a;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

}
