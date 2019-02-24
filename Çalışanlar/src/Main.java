
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniiz");
        String islemler = "1.Yazılımcı işlemler\n"
                + "2.Yönetici işlemleri\n"
                + "Çıkış için X'e basın";
        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("***************************************");
        while (true) {
            System.out.print("İşlem seçimi yapınız");
            String islem = scanner.nextLine();
            if (islem.equals("x")) {
                System.out.println("Programdan çıkılıyor");
                break;

            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Fahir", "ÖZBAY", 1, "Java,Phyton,C#,VB.NET");
                String yazilimci_islem = "1. Format At\n"
                        + "2.Bilgileri göster\n"
                        + "Çıkış için X'e basın";
                System.out.println(yazilimci_islem);
                while (true) {
                    System.out.println("İşlemi seçiniz");
                    String secilen_islem = scanner.nextLine();

                    if (secilen_islem.equals("x")) {
                        System.out.println("Ana menüye dönülüyor");
                        break;

                    } else if (secilen_islem.equals("1")) {
                        String secilen_os;
                        System.out.println("Lütfen kurulacak işletim sistemini yazınız");
                        secilen_os = scanner.nextLine();
                        yazilimci.formatAt(secilen_os);
                    } else if (secilen_islem.equals("2")) {
                        yazilimci.bilgilerigoster();

                    } else {
                        System.out.println("Geçersiz işlem");
                    }
                }

            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici(15, "Fahir", "ÖZBAY", 1);
                String Yonetici_islem = "Yönetisi işlemleri\n"
                        + "1.Zam yap\n"
                        + "2.Bilgileri Göster\n"
                        + "Ana menüye dönmek için X'e basın";
                System.out.println(Yonetici_islem);
                while (true) {
                    System.out.println("İşlem seçiniz");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("x")) {
                        System.out.println("Ana menüye dönülüyor");
                        break;

                    } else if (y_islem.equals("1")) {
                        System.out.println("Yapılacak zam miktarını giriniz.Örn(1500,50)");
                        double miktar = scanner.nextDouble();
                        yonetici.zamYap(miktar);
                        System.out.print("Çalışanlara " + miktar + " TL zam yapıldı");
                        scanner.nextLine();

                    } else if (y_islem.equals("2")) {
                        yonetici.bilgilerigoster();

                    } else {

                        System.out.println("Geçersiz işlem");
                    }
                }
            } else {
                System.out.println("Geçersiz işlem");
            }

        }

    }

}
