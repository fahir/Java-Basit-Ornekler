
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OyunKayıit {

    public static void oyunKaydet(Kart[][] kartlar) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))) {
            System.out.println("Oyun kaydediliyor");
            out.writeObject(kartlar);
        } catch (IOException ex) {
            Logger.getLogger(OyunKayıit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Kart[][] kayittanAl() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))) {
            Kart[][] cikti = (Kart[][]) in.readObject();
            return cikti;
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata oluştu");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sınıf bulunmadı");
        }
        return null;
    }
}
