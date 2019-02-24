
import java.io.File;
import java.util.Scanner;

public class Main {

    private static Kart[][] kartlar = new Kart[4][4];

    public static void kayittanAl() {
        File file = new File("kayit.bin");
        Scanner scanner = new Scanner(System.in);
        if (file.exists()) {
            System.out.println("Kaydedilmiş oyundan devam etmek istemisiniz(E/H)");
            String cevap = scanner.nextLine();
            if (cevap.equals("E")) {
                kartlar = OyunKayıit.kayittanAl();
                return;
            }
        }
        kartlar[0][0] = new Kart('A');
        kartlar[1][0] = new Kart('B');
        kartlar[2][0] = new Kart('C');
        kartlar[3][0] = new Kart('D');
        kartlar[0][1] = new Kart('E');
        kartlar[1][1] = new Kart('F');
        kartlar[2][1] = new Kart('G');
        kartlar[3][1] = new Kart('H');
        kartlar[0][2] = new Kart('A');
        kartlar[1][2] = new Kart('B');
        kartlar[2][2] = new Kart('C');
        kartlar[3][2] = new Kart('D');
        kartlar[0][3] = new Kart('E');
        kartlar[1][3] = new Kart('F');
        kartlar[2][3] = new Kart('G');
        kartlar[3][3] = new Kart('H');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cikis;
        kayittanAl();
        //tahta();
        while (bittimi() == false) {
            tahta();
            System.out.println("Çıkış için q ya basın");

            cikis = scanner.nextLine();
            if (cikis.equals("q")) {
                System.out.println("KAydetmke istermisiniz(E/H)");
                String kayit = scanner.nextLine();
                if (kayit.equals("E")) {
                    OyunKayıit.oyunKaydet(kartlar);
                } else {
                    System.out.println("Oyun kaydedilmedi");

                }
                System.out.println("Oyundan çıkılıyor");
                break;
            }
            tahminet();

        }
    }

    public static void tahminet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. tahmin Örn (1 2)");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        tahta();
        System.out.print("2. tahmin Örn (1 2)");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
            System.out.println("Doğru tahmin");
            kartlar[i2][j2].setTahmin(true);

        } else {
            System.out.println("Yanlış tahmin");
            kartlar[i1][j1].setTahmin(false);
        }

    }

    public static boolean bittimi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin() == false) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void tahta() {
        for (int i = 0; i < 4; i++) {
            System.out.println("______________________");

            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin()) {//tahmin doğruysa kartı göster

                    System.out.print(" |" + kartlar[i][j].getDeger() + " |");
                } else {
                    System.out.print(" | | ");
                }

            }
            System.out.println("");
        }
        System.out.println("_______________________");

    }
}
