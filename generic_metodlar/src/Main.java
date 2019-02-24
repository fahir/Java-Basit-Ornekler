
public class Main {

    public static void main(String[] args) {
        /*    Character[] char_dizi = {'J', 'A', 'V', 'A'};
        Integer[] int_dizi = {1, 2, 3, 4, 5, 6};
        String[] str_dizi = {"C#", "Sql", "Vb", "Pyton"};
        Ogrenci[] ogr_dizi = {new Ogrenci("Fahir"), new Ogrenci("Ayşe"), new Ogrenci("eryon")};
        yazdir(ogr_dizi);
        yazdir(char_dizi);
        yazdir(int_dizi);
        yazdir(str_dizi);*/
        Sayisal s1 = new Sayisal(50, 55, 85, 50);
        Sayisal s2 = new Sayisal(85, 85, 5, 85);
        Sayisal birinci = birinci(s1, s2);
        System.out.println("Birinci olan öğrencinin puanı " + birinci.puanhesapla());
        EsitAgirlik e1 = new EsitAgirlik(50, 85, 85, 96);
        EsitAgirlik e2 = new EsitAgirlik(80, 85, 65, 6);
        EsitAgirlik birinci2 = birinci(e1, e2);
        System.out.println("Birinci olan öğrenci puanı " + birinci2.puanhesapla());
    }

    public static <E extends Aday> E birinci(E x1, E x2) {//Aday clasından türetilmiş olan sınıflardan gelen her türlü veriyi karşılaştır
        if (x1.puanhesapla() > x2.puanhesapla()) {
            return x1;
        } else {
            return x2;
        }
    }

//    public static <E> void yazdir(E[] dizi) {
//        for (E e : dizi) {
//            System.out.println(e);
//        }
//    }
}
