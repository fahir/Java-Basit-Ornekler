
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static ArrayList<Integer> icerik = new ArrayList<>();

    public static void dosyaOku() {
        try {
            FileInputStream in = new FileInputStream("Sea.wav");
            int oku;
            while ((oku = in.read()) != -1) {
                icerik.add(oku);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya okunamadı");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void kopyala(String dosyaismi) {
        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);
            for (Integer deger : icerik) {
                out.write(deger);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya kopyalanamadı");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        dosyaOku();
        kopyala("Seaa.wav");
    }
}
