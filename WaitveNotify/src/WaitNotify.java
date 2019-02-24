
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitNotify {

    private Object lock = new Object();

    public void th1Fonksiyonu() {
        synchronized (lock) {
            System.out.println("Th1 çalışıyor");
            System.out.println("Th1 th2 nin kendisini uyandırmasını bekliyor");
            try {
                lock.wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Th1 uyandı devam ediyor");

        }
    }

    public void th2Fonksiyonu() {
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized (lock) {
            System.out.println("Th2 çalışıyor ");
            System.out.println("Devam etmek için bir tuşa basın");
            scanner.nextLine();
            lock.notify();
            System.out.println("Th2 th1 i uyandırdı");
        }

    }
}
