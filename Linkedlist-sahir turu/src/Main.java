
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void s_turla(LinkedList<String> sehirler) {
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;
        islemleri_bastir();
        Scanner scanner = new Scanner(System.in);
        if (!iterator.hasNext()) {//liste boş mu
            System.out.println("Şehir yok");

        }
        boolean cikis = false;
        boolean ileri = true;
        while (!cikis) {
            System.out.println("Bir işelm seçiniz");
            islem = scanner.nextInt();
            switch (islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next() + " şehrine gidiliyor");
                    } else {
                        System.out.println("Gidilecek şehir kalmadı");
                        ileri = true;
                    }
                    break;
                case 2:
                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();

                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous() + " şehrine dönülüyor");
                    } else {
                        System.out.println("dönülecek şehir kalmadı");
                    }

                    break;
                case 3:
                    cikis = true;
                    System.out.println("Uygulumadan çıkılıyor");
                    break;
            }

        }
    }

    public static void islemleri_bastir() {
        System.out.println("0 işlemleri görüntüle");
        System.out.println("1 bir sonraki şehir");
        System.out.println("2 bir önceki şehir");
        System.out.println("3 çık");

    }

    public static void main(String[] args) {

        LinkedList<String> sehirler = new LinkedList<String>();
        sehirler.add("Urfa");
        sehirler.add("Antep");
        sehirler.add("Maraş");
        s_turla(sehirler);
    }
}
