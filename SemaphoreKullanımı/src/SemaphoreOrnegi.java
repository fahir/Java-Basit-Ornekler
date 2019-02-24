
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SemaphoreOrnegi {

    private Semaphore sem = new Semaphore(3);//aynı anda 3 thread çalışacak

    public void thFonksiyonu(int id) {

        try {
            sem.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread başlıyor ID:" + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread çıkıyor ID:" + id);
        sem.release();
    }
}
