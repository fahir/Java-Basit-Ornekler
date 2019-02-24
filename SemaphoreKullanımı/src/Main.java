
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        SemaphoreOrnegi semaphore = new SemaphoreOrnegi();
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.thFonksiyonu(1);
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.thFonksiyonu(2);
            }
        });
        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.thFonksiyonu(3);

            }
        });
        Thread th4 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.thFonksiyonu(4);

            }
        });
        Thread th5 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.thFonksiyonu(5);

            }
        });
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
