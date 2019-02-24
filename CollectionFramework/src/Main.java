
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // ArrayList<String> a = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("C#");
        // System.out.println(list.get(2));
        for (String s : list) {
            System.out.println(s);
        }
        list.remove("Java");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
