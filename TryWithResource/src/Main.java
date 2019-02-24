
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try (FileWriter writer1 = new FileWriter("diller.txt", true)) {
            Scanner scanner = new Scanner(System.in);
            String dil;
            while (true) {
                System.out.println("Bir dil giriniz");
                dil = scanner.nextLine();
                if (dil.equals("-1")) {
                    System.out.println("Programdan çıkılıyor");
                    break;

                }
                writer1.write(dil);

            }

        } catch (IOException ex) {
            System.out.println("Dosya oluşturulurken hata oluştu");
        }
    }
}
