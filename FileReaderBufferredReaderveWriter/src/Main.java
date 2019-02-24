
import com.sun.corba.se.impl.ior.WireObjectKeyTemplate;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt", true))) {
            writer.write("Mehmet ÖZBAY,5\n");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu");
        }
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))) {
            while (scanner.hasNextLine()) {
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(",");
                System.out.println("Öğrenci Adı:" + array[0] + " Sırası:" + array[1]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("IOException oluştu");
        }

    }
}
