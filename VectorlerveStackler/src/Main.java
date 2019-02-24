
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Php");
        vector.add("Php");
        vector.add("Python");
        /*  for (String s : vector) {
            System.out.println(s);
        }*/
 /* ListIterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }*/
 /*   Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }*/
        // System.out.println("İlk eleman:" + vector.firstElement() + " Son eleman:" + vector.lastElement());
        Stack<String> stack = new Stack<>();
        stack.push("Python");
        stack.push("Css");
        stack.push("Go");

        // System.out.println("Son eleman çıkarılıyor:" + stack.pop());//son elemanı çıkar
        /* for (String s : stack) {
            System.out.println(s);
        }
        System.out.println(stack.empty());//stacak boş mu*/
        while (!stack.empty()) {
            System.out.println("Eleman çıkarılıyor " + stack.pop());
        }
    }
}
