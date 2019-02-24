
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjeyiYaz {

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {//ogrenci bin adından dosya oluştur.
            Ogrenci ogr1 = new Ogrenci("Fahir ÖZBAY", 53, "BÖTE");
            Ogrenci ogr2 = new Ogrenci("Adburrahman ÖZBAY", 83, "FTR");
            out.writeObject(ogr1);//ogr1 objesini yaz
            out.writeObject(ogr2);//ogr2 objesini yaz
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu");
        }
    }
}
