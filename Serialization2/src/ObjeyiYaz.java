
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjeyiYaz {

    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Fahir ÖZBAY", 53, "BÖTE");
        Ogrenci ogr2 = new Ogrenci("Ayşe ÖZBAY", 55, "BÖTE");
        Ogrenci ogr3 = new Ogrenci("Mehmet ÖZBAY", 54, "BÖTE");
        Ogrenci[] ogr_array = {ogr1, ogr2, ogr3};
        ArrayList<Ogrenci> ogr_list = new ArrayList<>(Arrays.asList(ogr_array));
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {//ogrenci bin adından dosya oluştur.
            out.writeObject(ogr_array);
            out.writeObject(ogr_list);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu");
        }
    }
}
