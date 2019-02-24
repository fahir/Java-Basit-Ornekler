
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hoş geldiniz");
        System.out.println("Çıkış için X e basın");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("üretebileceğiniz beyblade türleri Dragon,Dranza,Drayga,Draciel");
            String islem = scanner.nextLine();
            if (islem.equals("X")) {
                System.out.println("Programdan çıkılyor");
                break;
            } else {
                Beybladeuret uret = new Beybladeuret();
                Beyblade beyblade = uret.Beybladeurt(islem);//BEyblade sınıfında bir bey blade uret seçilen isleme gore
                if (beyblade == null) {
                    System.out.println("Geçersiz giriş lütfen tekrar deneyin");
                } else {
                    beyblade.bilgilerigoster();
                    beyblade.saldir();
                    beyblade.kutsalcik();
                }
            }
        }
    }
}
