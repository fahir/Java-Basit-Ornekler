
public class Main {

    public static void ucuncuFonk() {

        int a = 12 / 0;

    }

    public static void ikinciFonk() {
        try {
            ucuncuFonk();
        } catch (ArithmeticException e) {
            System.out.println("İkinci  metod : sayı sıfıra bölünemez");
        }
    }

    public static void birinciFonk() {
        try {
            ikinciFonk();

        } catch (ArithmeticException e) {
            System.out.println("birinci metod : sayı sıfıra bölünemez");
        }
    }

    public static void main(String[] args) {
        birinciFonk();
    }
}
