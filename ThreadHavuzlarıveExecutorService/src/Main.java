
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);//aynı anda en fazla iki thread çalışacak
        for (int i = 0; i <= 5; i++) {
            executor.submit(new Worker(String.valueOf(i), i));
        }
        executor.shutdown();//işleri teslim ettikten sonra kapat
        System.out.println("İşlemler teslim edildi");
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);//işlerin bitmesini 1 güne kadar bekle
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("İşlemler tamamlandı");
        /*
            Thread t1 = new Thread(new Worker("1", 1));
            Thread t2 = new Thread(new Worker("2", 2));
            Thread t3 = new Thread(new Worker("3", 3));
            Thread t4 = new Thread(new Worker("4", 4));
            Thread t5 = new Thread(new Worker("5", 5));
            System.out.println("İşler başladı");
            t1.start();
            t2.start();
            try {
            t1.join();
            t2.join();

            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            t3.start();
            t4.start();
            try {
            t3.join();
            t4.join();

            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            t5.start();
            try {
            t5.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("İşler bitti.");*/

    }
}
