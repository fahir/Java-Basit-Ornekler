
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReentranLockOrnegi {

    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();

    public void arttir() {
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }

    public void th1Fonksiyonu() {
        lock.lock();
        System.out.println("Th1 uyandırılmayı bekliyor");
        try {
            cond.await();//uyu
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentranLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Th1 çalışıyor");
        System.out.println("Th1 uyandırıldı işlemine devam ediyor");
        arttir();

        lock.unlock();

    }

    public void th2Fonksiyonu() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentranLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        System.out.println("Th2 çalışıyor");
        arttir();
        System.out.println("Devam etmek için bir tuşa basın");
        scanner.nextLine();
        cond.signal();
        System.out.println("Th1 i th2 uyandırdı");
        lock.unlock();

    }

    public void threadOver() {
        System.out.println("Say değişkeninin değeri:" + say);
    }
}
