
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjeyiOku {

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {//ogrenci bin dosyasını oku
            Ogrenci[] ogr_array = (Ogrenci[]) in.readObject();
            ArrayList<Ogrenci> ogr_list = (ArrayList<Ogrenci>) in.readObject();
            System.out.println("------------------------");
            for (Ogrenci o : ogr_array) {
                System.out.println(o);
                System.out.println("------------------------");
            }
            for (Ogrenci o : ogr_list) {
                System.out.println(o);
                System.out.println("------------------------");

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sınıf bulunamadı");
        }
    }
}
