
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjeyiOku {

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {//ogrenci bin dosyasını oku
            Ogrenci ogr1 = (Ogrenci) in.readObject();//ogr1 i kou
            Ogrenci ogr2 = (Ogrenci) in.readObject();// ogr2 yi oku
            System.out.println("*******************");
            System.out.println(ogr1);
            System.out.println("*******************");
            System.out.println(ogr2);

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sınıf bulunamadı");
        }
    }
}
