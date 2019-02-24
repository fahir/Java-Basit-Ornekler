
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockOrnegi {

    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap();
    private Random rnd = new Random();

    private Lock lock1 = new ReentrantLock();

    private Lock lock2 = new ReentrantLock();

    public void lockKontrol(Lock a, Lock b) {
        boolean a_alindi = false;
        boolean b_alindi = false;
        while (true) {
            a_alindi = a.tryLock();
            b_alindi = b.tryLock();
            if (b_alindi == true && a_alindi == true) {
                return;
            }
            if (a_alindi == true) {
                a.unlock();
            }
            if (b_alindi == true) {
                b.unlock();
            }
        }
    }

    public void th1Fonksiyonu() {
        lockKontrol(lock1, lock2);
        for (int i = 0; i < 5000; i++) {
            Hesap.paraTransferi(hesap1, hesap2, rnd.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void th2Fonksiyonu() {
        lockKontrol(lock1, lock2);
        for (int i = 0; i < 5000; i++) {
            Hesap.paraTransferi(hesap2, hesap1, rnd.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void threadOver() {
        System.out.println("Hesap1 bakiye:" + hesap1.getBakiye() + " Hesap2 bakiye:" + hesap2.getBakiye());
        System.out.println("Toplam bakiye:" + (hesap1.getBakiye() + hesap2.getBakiye()));
    }
}
