
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author win
 */
public class ATM {

    public void calis(Hesap hesap) {
        Giris giris = new Giris();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoş geldiniz.");
        System.out.println("*************************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("*************************************");
        int giris_hakki = 3;
        while (true) {
            if (giris.giris(hesap)) {

                System.out.println("Giriş başarılı");
                break;

            } else {
                System.out.println("Giriş başarısız");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giriş hakkınız bitti");
                return;//metodu sonlandırır

            }
        }

        String islemler = "1.Bakiye görüntüle\n"
                + "2.para yatırma\n"
                + "3.Para çekme\n"
                + "Çıkış için Q harfine basın";
        System.out.println(islemler);
        OUTER:
        while (true) {
            System.out.println("******************************");
            System.out.println("İşlemi seçiniz");
            String islem = scanner.nextLine();
            switch (islem) {
                case "q":
                    break OUTER;
                case "1":
                    System.out.println("Güncel bakiyeniz " + hesap.getBakiye());
                    break;
                case "2": {
                    System.out.println("Yatırmak istediğiniz miktarı girin");
                    double tutar = scanner.nextDouble();
                    scanner.nextLine();
                    hesap.yatir(tutar);
                    break;
                }
                case "3": {
                    System.out.println("Çekmek istediğiniz miktarı girin");
                    double tutar = scanner.nextDouble();
                    scanner.nextLine();
                    hesap.cek(tutar);
                    break;
                }
                default:
                    System.out.println("Geçersiz işlem seçimi");
                    break;
            }
        }

    }
}
