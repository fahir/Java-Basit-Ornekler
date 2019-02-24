
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  int a = 5;//tek değer alıyor
        int[] a = new int[5];//5 adet int türünde değer alabilir
        int[] b = {10, 20, 30, 40, 50};
        //  System.out.println("Array uzunluğu:" + b.length);
        Scanner scanner = new Scanner(System.in);
        bastir(b);
        System.out.println("ortalama:" + ortalama(b));
        /* for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ". değeri girin");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
         */
    }

    public static double ortalama(int[] array) {
        int ort = 0;

        for (int i = 0; i < array.length; i++) {
            ort += array[i];
        }
        return (double) (ort / array.length);
    }

    public static void bastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ":" + array[i]);
        }
    }
}
