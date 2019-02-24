
import java.util.Scanner;

class siyasiException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Siyai yasağınız bulunuyor....");
    }

}

class vizException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Vizeniz yok.........");
    }

}

class harcException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Harç tam yatırılmamış.....");
    }

}

public class Yolcu {

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

    public void harc() throws harcException {
        if (this.harc < 15) {
            throw new harcException();
        } else {
            System.out.println("Harç kontrol tamamlandı");
        }
    }

    public void yasak() throws siyasiException {
        if (this.yasak == true) {
            throw new siyasiException();
        } else {
            System.out.println("Siyasi yasak kontrol tamam");
        }
    }

    public void vize() throws vizException {
        if (this.vize == true) {
            throw new vizException();
        } else {
            System.out.println("Vize kontrol tamam");
        }
    }

}
