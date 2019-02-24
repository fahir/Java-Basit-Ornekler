
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kumanda programına hoş geldiniz");
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler\n"
                + "1. kanalları listele\n"
                + "2. kanal ekle\n"
                + "3. kanal sil\n"
                + "4. kanal sayısı öğren\n"
                + "çıkmak için Q ya basın";
        Kumanda kumanda = new Kumanda();

        while (true) {
            System.out.println(islemler);
            System.out.println("işlemi giriniz:");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor");
                break;

            } else if (islem.equals("1")) {
                kanalllariGoster(kumanda);
            } else if (islem.equals("2")) {
                System.out.print("Kanal ismi giriniz:");
                String kIsmi = scanner.nextLine();
                kumanda.kanalEkle(kIsmi);
            } else if (islem.equals("3")) {
                System.out.println("Silinecek kanal ismini yazın");
                String kIsmi = scanner.nextLine();
                kumanda.kanalSil(kIsmi);
            } else if (islem.equals("4")) {
                System.out.println("Kanal sayısı:" + kumanda.kanalSayisi());
            } else {
                System.out.println("Geçersiz işlem");
            }
        }
    }

    public static void kanalllariGoster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Kanal bulunamadı");
        } else {
            for (String s : kumanda) {
                System.out.println("Kanal:" + s);
            }
        }
    }
}
