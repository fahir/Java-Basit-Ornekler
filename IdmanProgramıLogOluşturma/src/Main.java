
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz");
        String idmanlar = "1. Burpee\n"
                + "2.Pushup\n"
                + "3.Situp\n"
                + "4.Squat";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun ");
        System.out.print("Burpee sayısı:");
        int burpee_sayisi = scanner.nextInt();
        System.out.print("Pushup sayısı:");
        int pushup_sayisi = scanner.nextInt();
        System.out.print("Situp sayısı:");
        int Situp_sayisi = scanner.nextInt();
        System.out.print("Squat sayısı:");
        int Squat_sayisi = scanner.nextInt();
        scanner.nextLine();
        idman idman1 = new idman(burpee_sayisi, pushup_sayisi, Situp_sayisi, Squat_sayisi);
        System.out.println("İdmanınız başlıyor");
        int i = 1;
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("İdman programı\n");
            writer.write("Burpee sayısı:" + idman1.getBurpee_sayisi() + "\n");
            writer.write("Squat sayısı:" + idman1.getSquat_sayisi() + "\n");
            writer.write("Pushup sayısı:" + idman1.getPushup_sayisi() + "\n");
            writer.write("situp sayısı:" + idman1.getSitup_sayisi() + "\n");
            while (idman1.idmanBittiMi() == false) {
                System.out.print("Hareket türü(Burpee,Situp,Squat,Pushup):");
                String tur = scanner.nextLine();
                System.out.println(tur + " Hareketinden kaç adet yapacaksınız");
                int adet = scanner.nextInt();
                scanner.nextLine();//nextint nextlinde ile çakışmasın diye bu kodu ekliyoruz
                idman1.hareket_yap(tur, adet);
                writer.write(i + ". işlem ---->isim:" + tur + " Adet:" + adet + "\n");
                i++;
            }
            System.out.println("İdmanını başarılı bir şekilde tamamladın");

        } catch (IOException ex) {
            System.out.println("Loglama işlemi sırasında hata oluştu");
        }

    }
}
