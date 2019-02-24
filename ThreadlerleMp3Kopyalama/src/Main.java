
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
            FileInputStream in = new FileInputStream("s.zip");
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
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("S1.zip");

            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("S2.zip");

            }
        });
        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("S3.zip");

            }
        });
        Thread th4 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("S4.zip");

            }
        });
        Thread th5 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("S5.zip");

            }
        });
        Thread th6 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("S6.zip");

            }
        });
        Thread th7 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("S7.zip");

            }
        });
        Thread th8 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("S8.zip");

            }
        });
        long baslangic = System.currentTimeMillis();

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();
            th6.join();
            th7.join();
            th8.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        long bitis = System.currentTimeMillis();

        System.out.println("Toplam geçen süre :" + (bitis - baslangic));
    }
}
