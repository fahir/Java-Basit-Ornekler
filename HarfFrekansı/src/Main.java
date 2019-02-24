
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi giriniz");
        String cumle = scanner.nextLine();
        Map<Character, Integer> frekans = new TreeMap<>();

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.charAt(i);

            if (frekans.containsKey(c)) {//gelen harf önceden var mıydı
                frekans.replace(c, frekans.get(c) + 1);//vars 1 arttır
            } else {
                frekans.put(c, 1);//yoksa ekle değerini 1 yap
            }
        }

        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println("Karakter:" + entry.getKey() + " adet:" + entry.getValue());
        }
    }

}
