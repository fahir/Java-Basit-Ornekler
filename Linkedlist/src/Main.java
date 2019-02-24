
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void bastir(LinkedList<String> gidilecek) {
        /*    for (String yer : gidilecek) {
            System.out.println(yer);
        }*/
        ListIterator<String> iterator = gidilecek.listIterator();//iterator nesnesi oluşturup gidileceğin içeiriğini atadık
        while (iterator.hasNext()) {//ileride eleman kaldı mı
            System.out.println(iterator.next());//sıradakini yazdır

        }

    }

    public static void sirali_ekle(LinkedList<String> gidilecek, String yeni) {
        ListIterator<String> iterator = gidilecek.listIterator();//iterator nesnesi oluşturup gidileceğin içeiriğini atadık
        while (iterator.hasNext()) {//ileride eleman kaldı mı
            int karsilatir = iterator.next().compareTo(yeni);

            if (karsilatir == 0) {//yani iki değer eşitse 0 gelir
                System.out.println("Listenizde eleman mevcut");
                return;//metodu osnlandır
            } else if (karsilatir < 0) {// yani gelen değer daha büyükse(alfabetik olarak sonra ise)

            } else if (karsilatir > 0) {// yani gelen değer daha küçükse(alfabetik olarak önce ise)
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);

    }

    public static void main(String[] args) {
        LinkedList<String> gidilecek = new LinkedList<String>();
//        gidilecek.add("Urfa");
//        gidilecek.add("antep");
//        gidilecek.add("maraş");
//        gidilecek.add("adıyaman");
//        bastir(gidilecek);
//        System.out.println("--------------------------------------------");
//        gidilecek.add(2, "mezre");
//        bastir(gidilecek);
//        System.out.println("---------------------------------------------");
//        gidilecek.remove(2);
//        bastir(gidilecek);

        sirali_ekle(gidilecek, "urfa");
        sirali_ekle(gidilecek, "antep");
        sirali_ekle(gidilecek, "mezre");
        sirali_ekle(gidilecek, "maraş");
        bastir(gidilecek);

    }

}
