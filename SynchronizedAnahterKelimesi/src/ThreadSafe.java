
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadSafe {

    private int count = 0;

    public synchronized void arttir() {
        count++;
    }

    public void ThreadleriCalistir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1");
                for (int i = 0; i < 5000; i++) {
                    arttir();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2");
                for (int i = 0; i < 5000; i++) {
                    arttir();
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Count değişkeninin değeri:" + count);
    }

    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.ThreadleriCalistir();
    }
}
