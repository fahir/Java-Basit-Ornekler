
import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean yasak;
    private boolean vize;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedeli:");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yurtdışı yasağınız var mı?Evet/Hayır");
        String cevap = scanner.nextLine();
        if (cevap.equals("Evet")) {
            this.yasak = true;

        } else if (cevap.equals("Hayır")) {
            this.yasak = false;
        }
        System.out.println("Vizeeniz var mı?Var/Yok");
        String v_cevap = scanner.nextLine();
        if (v_cevap.equals("Var")) {
            this.vize = true;
        } else if (v_cevap == "Yok") {
            this.vize = false;
        }
    }

    @Override
    public boolean harc() {
        if (this.harc < 15) {
            System.out.println("Yatırdığınız harç yetersi");
            return false;
        } else {
            System.out.println("Harç ödeme kontrol işlemleri tamam");
            return true;
        }
    }

    @Override
    public boolean yasak() {
        if (this.yasak == true) {
            System.out.println("Siyasi yasağınız bulunuyor yurt dışına çıkmazsınız");
            return false;
        } else {
            System.out.println("Yurt dışı yasağı kontrol işlemleri tamam");
            return true;
        }
    }

    @Override
    public boolean vize() {
        if (this.vize == true) {
            System.out.println("Vize kontrol işlemleri tamam");

            return true;
        } else {
            System.out.println("vizeniz olmadığı için yurtdışına çıkamazsınız");
            return false;
        }
    }

}
