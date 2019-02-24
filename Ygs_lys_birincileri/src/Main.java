
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("YGS LYS birinci bulma");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci ogr isim:");
        String i1 = scanner.nextLine();
        System.out.println("Netler Tr Mat Ede Fiz :");
        int tr1 = scanner.nextInt();
        int mat1 = scanner.nextInt();
        int ede1 = scanner.nextInt();
        int fiz1 = scanner.nextInt();
        scanner.nextLine();
        ////////////////////////////////////////
        System.out.println("İkinci ogr isim:");
        String i2 = scanner.nextLine();
        System.out.println("Netler Tr Mat Ede Fiz :");
        int tr2 = scanner.nextInt();
        int mat2 = scanner.nextInt();
        int ede2 = scanner.nextInt();
        int fiz2 = scanner.nextInt();
        scanner.nextLine();
///////////////////////////////////////////////
        System.out.println("Üçüncü ogr isim:");
        String i3 = scanner.nextLine();
        System.out.println("Netler Tr Mat Ede Fiz :");
        int tr3 = scanner.nextInt();
        int mat3 = scanner.nextInt();
        int ede3 = scanner.nextInt();
        int fiz3 = scanner.nextInt();
        scanner.nextLine();
        String islemler = "İşlemler  \n"
                + "1.Eşit ağırlık \n"
                + "2.Sayısal öğrencileri\n"
                + "Çıkış için x e bas";
        System.out.println(islemler);
        while (true) {
            System.out.println("işlem seçiniz");
            String islem = scanner.nextLine();
            if (islem.equals("x")) {
                System.out.println("çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                EsitAgirlik ogr1 = new EsitAgirlik(tr1, mat1, ede1, fiz1, i1);
                EsitAgirlik ogr2 = new EsitAgirlik(tr2, mat2, ede2, fiz2, i2);
                EsitAgirlik ogr3 = new EsitAgirlik(tr3, mat3, ede3, fiz3, i3);
                EsitAgirlik birinci = birinci(ogr1, ogr2, ogr3);
                System.out.println("Eşit ağrılık birinci öğrenci " + birinci.getIsim() + " puanı " + birinci.puanhesapla());
            } else if (islem.equals("2")) {
                Sayisal ogr1 = new Sayisal(tr1, mat1, ede1, fiz1, i1);
                Sayisal ogr2 = new Sayisal(tr2, mat2, ede2, fiz2, i2);
                Sayisal ogr3 = new Sayisal(tr3, mat3, ede3, fiz3, i3);
                Sayisal birinci = birinci(ogr1, ogr2, ogr3);
                System.out.println("Sayısal ağrılık birinci öğrenci " + birinci.getIsim() + " puanı " + birinci.puanhesapla());
            } else {
                System.out.println("Geçersiz işlem");
            }
        }
    }

    public static <E extends Aday> E birinci(E x1, E x2, E x3) {//Aday clasından türetilmiş olan sınıflardan gelen her türlü veriyi karşılaştır
        if (x1.puanhesapla() > x2.puanhesapla() && x1.puanhesapla() > x3.puanhesapla()) {
            return x1;
        } else if (x1.puanhesapla() < x2.puanhesapla() && x2.puanhesapla() > x3.puanhesapla()) {
            return x2;
        } else {
            return x3;
        }
    }

//    public static <E> void yazdir(E[] dizi) {
//        for (E e : dizi) {
//            System.out.println(e);
//        }
//    }
}
