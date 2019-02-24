
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Mat.faktoriyel faktoriyel = new Mat().new faktoriyel();//önce ana class sonra inner class oluşuyor
        Mat.Asal asal = new Mat().new Asal();
        Mat.Alan.dairealan alan = new Mat().new Alan().new dairealan();//mat içinden alan içinde daire alan sınıfından oluştur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int sayi = scanner.nextInt();
        if (asal.asalmi(sayi)) {
            System.out.println("Sayı asal");
        } else {
            System.out.println("Sayı asal değil");
        }
        faktoriyel.f_hesapla();
        System.out.println("Dairenin yarı çağını giriniz");
        int ycap = scanner.nextInt();
        alan.daire_alan(ycap);
    }
}
