
import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        System.out.println("Ramazan pidesi uygulaması");
        Queue<String> pideKuyrugu = new LinkedList<>();
        pideKuyrugu.offer("1");
        pideKuyrugu.offer("2");
        pideKuyrugu.offer("3");
        pideKuyrugu.offer("4");
        pideKuyrugu.offer("5");
        pideKuyrugu.offer("6");
        pideKuyrugu.offer("7");
        pideKuyrugu.offer("8");
        pideKuyrugu.offer("9");
        pideKuyrugu.offer("10");
        int pideSayisi = 1 + rnd.nextInt(10);//0 ile 10 arası rastgele bir değer seç
        System.out.println("Pideler çıkıyor");
        System.out.println("Çıkan pide sayısı:" + pideSayisi);
        Thread.sleep(3000);//3 sn bekle
        while (pideSayisi != 0) {
            System.out.println(pideKuyrugu.poll() + " pideyi alıyor..");
            pideSayisi--;
            Thread.sleep(1000);//1 saniye bekle
        }
        System.out.println("Pide Kalmadı");
    }
}
