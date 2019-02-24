
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        // System.out.println(queue.peek());//ilk elemanı yazdır
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("**********Eleman Çıkarılıyor " + queue.poll() + "************");//ilk elemanı sil

        for (String s : queue) {
            System.out.println(s);
        }
        //System.out.println(queue.isEmpty());//kuyruk boş mu
        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor :" + queue.poll());
        }
    }
}
