
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //  Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Go");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println("**********************");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        /*  set.add("Java");
        set.add("C++");
        set.add("Go");
        list.add("Java");
        list.add("C++");
        list.add("Go");
        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("***************************************");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("***************************************");*/

    }
}
