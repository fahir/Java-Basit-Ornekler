
import java.util.Scanner;

public class Mat {

    private double pi = Math.PI;

    public class faktoriyel {

        public void f_hesapla() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayı igiriniz");
            int sayi = scanner.nextInt();
            int fact = 1;
            for (int i = 2; i <= sayi; i++) {
                fact *= i;
            }
            System.out.println(sayi + " faktöriyel :" + fact);
        }
    }

    public class Asal {

        public boolean asalmi(int sayi) {
            int i = 2;
            while (i < sayi) {
                if (sayi % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public class Alan {

        public class dairealan {

            public void daire_alan(int yaricap) {
                System.out.println("Dairenin alanı " + (yaricap * yaricap) * pi);
            }
        }
    }
}
