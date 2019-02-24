
import java.util.Scanner;

public class Main {

    public static void mekanKontrol(int yas) throws InvalidAgeException {
        if (yas < 18) {
            throw new InvalidAgeException("Invalid Age");
        } else {
            System.out.println("Hoşgeldiniz.");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lüften yaşınızı girin");
        int yas = scanner.nextInt();
        scanner.nextLine();

        mekanKontrol(yas);

    }
}
