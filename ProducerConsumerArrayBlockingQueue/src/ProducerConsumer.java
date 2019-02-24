
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer {

    Random rnd = new Random();

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);//10 adet öğe alabilir

    public void produce() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Integer value = rnd.nextInt(100);//0-100 arasında raasgele bir sayı üret
                queue.put(value);//rasgele üretilen değer kuyruğa ekleniyor
                System.out.println("Producer üretiyor " + value);

            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void consume() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Integer value = queue.take();//kuyruktan değer çekiliyor
                System.out.println("Consume tüketiyor " + value);
                System.out.println("Queue size:" + queue.size());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
