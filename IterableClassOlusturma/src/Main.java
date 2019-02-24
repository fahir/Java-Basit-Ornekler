
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String[] kanallar = {"0", "01", "02", "2", "3", "34"};
        Radyo radyo = new Radyo(kanallar);
        /*for (String s : radyo) {
            System.out.println(s);
        }*/
        Iterator<String> iterator = radyo.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
