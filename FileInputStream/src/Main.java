
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dosya.txt");
            int deger;
            String s = "";
            while ((deger = fis.read()) != -1) {
                s += (char) deger;
            }
            System.out.println("Dosya içeriği :" + s);
            /* System.out.println("Okunan 1. değer" + (char) (fis.read()));
            System.out.println("Okunan 2. değer" + (char) (fis.read()));
            System.out.println("Okunan 3. değer" + (char) (fis.read()));*/
 /* fis.skip(5);
            System.out.println("Okunan değer" + (char) (fis.read()));
            System.out.println("Okunan değer" + (char) (fis.read()));
            System.out.println("Okunan değer" + (char) (fis.read()));*/

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunumadı");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata oluştu");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken hata oluştu");
            }
        }
    }
}
