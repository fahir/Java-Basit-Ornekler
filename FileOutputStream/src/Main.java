
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        // File file =new File("dosya.txt");
        try {
            fos = new FileOutputStream("dosya.txt", true);
            // byte[] array = {101, 66, 35, 58};
            String s = "Fahir ÖZBAY";//string yazdık
            System.out.println(s.getBytes());
            byte[] array = s.getBytes();//byte dönüştürdük
            fos.write(array);//dosyaya yazdık

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken hata oluştu");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu");
            }
        }
    }
}
