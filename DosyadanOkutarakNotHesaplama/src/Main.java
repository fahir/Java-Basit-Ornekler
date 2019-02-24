
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalnot) {
        String cikti = "";
        double toplamNot = (vize1 * 0.3) + (vize2 * 0.3) + (finalnot * 0.4);
        if (toplamNot >= 90) {
            cikti = isim + " AA aldı.";
        } else if (toplamNot >= 85) {
            cikti = isim + " BA aldı.";
        } else if (toplamNot >= 80) {
            cikti = isim + " BB aldı.";
        } else if (toplamNot >= 75) {
            cikti = isim + " CB aldı.";
        } else if (toplamNot >= 70) {
            cikti = isim + " CC aldı.";
        } else if (toplamNot >= 65) {
            cikti = isim + " DC aldı.";
        } else if (toplamNot >= 60) {
            cikti = isim + " DD aldı.";
        } else if (toplamNot >= 55) {
            cikti = isim + " FD aldı.";
        } else {
            cikti = isim + " FF aldı.";
        }
        return cikti;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("dosya.txt"));
                FileWriter writer = new FileWriter("harfNotları.txt")) {
            while (scanner.hasNext()) {
                String ogrenciBilgileri = scanner.nextLine();
                String[] ogrenciArray = ogrenciBilgileri.split(",");
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalnot = Integer.valueOf(ogrenciArray[3]);

                String cikti = harfNotuHesapla(ogrenciArray[0], vize1, vize2, finalnot);
                writer.write(cikti + "\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya okunamadı");
        } catch (IOException ex) {
            System.out.println("IOException");
        }

    }
}
