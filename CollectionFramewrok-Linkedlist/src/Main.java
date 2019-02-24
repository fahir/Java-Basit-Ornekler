
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        zamanhesapla("LinkedList", list);
        // zamanhesapla("ArrayList", list2);

    }

    public static void zamanhesapla(String veri_tipi, List<Integer> list) {
//listin sonuna değer ekleme
        long baslangic, bitis;
        baslangic = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(0, i);
        }
        bitis = System.currentTimeMillis();
        System.out.println(veri_tipi + " ekleme süresi:" + (bitis - baslangic) + " ms");
    }

}
