
import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player> {

    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;
        } else if (this.id > player.id) {
            return 1;

        }
        return 0;

    }

    @Override
    public String toString() {
        return "Player{" + "isim=" + isim + ", id=" + id + '}';
    }

}

public class Main {

    public static void main(String[] args) {
        Queue<Player> queue = new PriorityQueue<>();

        queue.offer(new Player("fahir", 10));
        queue.offer(new Player("Ayşe", 1));
        queue.offer(new Player("Eryon", 18));
        queue.offer(new Player("Şörrük", 1895));
        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor " + queue.poll());
        }

        /* for (Integer i : queue) {
            System.out.println(i);
        }*/
        //System.out.println(queue.peek());// kuyrupun ilk elemanı
        //queue.clear();//kuyrupu temizle
        //  System.out.println(queue.contains(5));// kuyrukta 5 var mı
        /* while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor:" + queue.poll());
        }  */
    }
}
