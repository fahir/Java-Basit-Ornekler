
import java.util.Scanner;

public class Main {

    public static void mekanKontrol(int yas) {
        if (yas < 18) {
            throw new ArithmeticException();
        } else {
            System.out.println("Hoşgeldiniz");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin");
        int yas = scanner.nextInt();
        scanner.nextLine();
        try {
            mekanKontrol(yas);

        } catch (ArithmeticException e) {
            System.out.println("Yaşınız 18 den küçük giriş yapamazsınız.");
        }

    }
}
