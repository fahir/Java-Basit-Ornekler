
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] array_doldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }

    public static void array_sort(int[] array) {
        Arrays.sort(array);
        array_bas(array);
    }

    public static void array_bas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ".eleman " + array[i]);
        }
    }

    public static void main(String[] args) {
        //int[] a = array_doldur(5);//a dizisine 5 değişkenli bir dizi tanımlandı
        // array_bas(a);
        //array_sort(a);
        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5, 6};
        if (Arrays.equals(a1, a2)) {//iki array içeriği eşit mi
            System.out.println("Eşit");

        } else {
            System.out.println("Eşit değil");
        }

    }
}
