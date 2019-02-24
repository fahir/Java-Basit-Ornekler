
import java.util.Scanner;

public class Test {

    private static Sarkicilar sarkici = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir() {
        System.out.println("\t 0-İşlemleri Göster");
        System.out.println("\t 1-Sarkıcıları Göster");
        System.out.println("\t 2-Şarkıcı ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı sil");
        System.out.println("\t 5-Şarkıcı ara");
        System.out.println("\t 6-Çıkış");
    }

    public static void goruntule() {
        sarkici.sarkicilari_bastir();
    }

    public static void s_ekle(String isim) {
        sarkici.s_ekle(isim);
    }

    public static void s_guncelle(String yeni, int index) {
        sarkici.s_guncelle(yeni, 0);
    }

    public static void s_sil(int index) {
        sarkici.s_sil(index);
    }

    public static void s_ara(String isim) {
        sarkici.s_ara(isim);
    }

    public static void main(String[] args) {
        System.out.println("\t Şarkıcı uygulamasına hoş geldiniz");
        islemleri_bastir();
        int islem;
        boolean cikis = false;
        while (!cikis) {
            System.out.println("İşlem seçin");
            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    System.out.println("Yeni şarkıcı ismi girin:");
                    String isim = scanner.nextLine();
                    s_ekle(isim);
                    break;
                case 3:
                    System.out.println("Güncellenecek şarkıcının numarasını girin:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Yeni isim girin:");
                    String yeni = scanner.nextLine();
                    s_guncelle(yeni, index);
                    break;
                case 4:
                    System.out.println("Silinecen şarkıcı numarasını girin:");
                    int index1 = scanner.nextInt();
                    scanner.nextLine();
                    s_sil(index1);
                    break;
                case 5:
                    System.out.println("Aranan ismi girin:");
                    String isim2 = scanner.nextLine();
                    s_ara(isim2);
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor");
                    break;
                default:
                    System.out.println("Geçersiz işlem");
            }

        }

    }
}
