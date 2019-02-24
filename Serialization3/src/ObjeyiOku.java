
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjeyiOku {

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {//ogrenci bin dosyasını oku
            Ogrenci ogrenci = (Ogrenci) in.readObject();
            System.out.println(ogrenci);
            System.out.println("Öğrenci Sayıcı:" + Ogrenci.getOgr_sayisi());

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sınıf bulunamadı");
        }
    }
}
