
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n"
                + "1.Kare alan hesabı\n"
                + "2.Üçgen alan hesabı\n"
                + "3.Daire alan hesabı\n"
                + "Çıkmak için X e bas";
        while (true) {
            System.out.println(islemler);
            System.out.println("hangi şekil alanı hesaplnanacak");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            if (sekil_turu.equals("x")) {
                System.out.println("Programdan çıkılıyor");
                break;
            } else if (sekil_turu.equals("1")) {
                System.out.println("Karenin kenar uzunluğu");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("Kare", kenar);
                sekil.alan_hesapla();
            } else if (sekil_turu.equals("2")) {
                System.out.println("1. kenar: ");
                int kenar1 = scanner.nextInt();
                System.out.println("2. kenar: ");
                int kenar2 = scanner.nextInt();
                System.out.println("3. kenar: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen("üçgen1", kenar1, kenar2, kenar3);
                sekil.alan_hesapla();
            } else if (sekil_turu.equals("3")) {
                System.out.println("Yarı çap: ");
                int ya_cap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire1", ya_cap);
                sekil.alan_hesapla();

            }
        }

    }
}
