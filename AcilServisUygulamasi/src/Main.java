
import java.util.PriorityQueue;
import java.util.Queue;

public class Mains {

	public static void main(String[] args) {
		Queue<Hasta> acilServis = new PriorityQueue<>();
		acilServis.offer(new Hasta("1", "Baş ağrısı"));
		acilServis.offer(new Hasta("2", "Apandisit"));
		acilServis.offer(new Hasta("5", "Yanık"));
		acilServis.offer(new Hasta("6", "Yanık"));
		acilServis.offer(new Hasta("4", "Baş ağrısı"));
		acilServis.offer(new Hasta("3", "Apandisit"));
		int i = 1;
		while (acilServis.isEmpty() != true) {
			System.out.println(i + ". Hasta");
			System.out.println(acilServis.poll());
			i++;
		}
	}
}
