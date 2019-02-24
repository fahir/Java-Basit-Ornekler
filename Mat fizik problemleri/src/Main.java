
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mat ve fizik prob çöz");
        String islemler = "işlemler......\n"
                + "1.daire alanı hesapla\n"
                + "2.Üçgen çevresi hesapla\n"
                + "3. iki vektörün iç çarpımını hesaplama\n"
                + "Çıkış X";
        while (true) {
            System.out.println(islemler);
            String islem = scanner.nextLine();
            if (islem.equals("x")) {
                System.out.println("Programdan çıkılıyo");
                break;
            } else if (islem.endsWith("1")) {
                System.out.println("yarı çap girin");
                int ycap = scanner.nextInt();
                scanner.nextLine();
                Problem.Mat.d_alan(ycap);

            } else if (islem.equals("2")) {
                System.out.println("kenar 1:");
                int k1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("kenar 2:");
                int k2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("kenar 3:");
                int k3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Mat.ucgen_cev(k1, k2, k3);
            } else if (islem.equals("3")) {
                vek vek1 = new vek("vektör 1");
                vek vek2 = new vek("Vektör 2");
                Problem.fizik.ic_carp(vek1, vek2);
            } else {
                System.out.println("Yanlış seçim");
            }
        }
    }
}
