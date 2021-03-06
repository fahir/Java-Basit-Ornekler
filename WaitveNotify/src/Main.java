
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify();

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.th1Fonksiyonu();
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.th2Fonksiyonu();
            }
        });
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
