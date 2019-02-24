
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void mekanKontrol(int yas) throws IOException {
        if (yas < 18) {
            throw new IOException();//checked exception fırlatmak istersek üste throws ve hata türünü eklemek lazım
        } else {
            System.out.println("Hoşgeldiniz");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin");
        int yas = scanner.nextInt();
        scanner.nextLine();

        mekanKontrol(yas);

    }
}
