
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] et = new String[5];
        String[] ogr = new String[15];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println(i + ". etkinlik için minimum öğrenci sayısı");
            int min = scan.nextInt();
            scan.nextLine();
            System.out.println(i + ". etkinlik için maksimum öğrenci sayısı:");
            int max = scan.nextInt();
            scan.nextLine();
            for (int j = 0; j < 15; j++) {
                Random rnd = new Random();

                for (int k = min; k < max; k++) {
                    rnd.nextInt(15);
                    et[i] = String.valueOf(k);
                    System.out.println(et[i] + ". etkinliğe katılan öğrenci: Öğrenci " + j);
                }

            }

        }

    }
}
