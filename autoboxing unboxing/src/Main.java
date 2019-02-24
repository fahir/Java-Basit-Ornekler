
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();//int türünde array list üreteceksen Integer
        for (int i = 0; i < 10; i++) {
            arraylist2.add(i * 3);//(Autoboxing işlemi)arraylist2 ye değerleri istediğimiz şekilde tanımlıyoruz

        }
        for (int i = 0; i < arraylist2.size(); i++) {
            System.out.println(arraylist2.get(i));//(Unboxing işlemi) arraylist2 deki değerlerin ekrana yazdırıyoruz
        }
    }
}
