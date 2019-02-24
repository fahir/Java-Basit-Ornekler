
import java.io.Serializable;

public class Ogrenci implements Serializable {

    private String isim;
    private int id;//transient serileştirmek istemediğimiz değere yazılıyor
    private String bolum;
    private static int ogr_sayisi;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci ismi:" + isim
                + "\nNumara:" + id
                + "\nBölüm:" + bolum;
        return bilgiler;
    }

    public static int getOgr_sayisi() {
        return ogr_sayisi;
    }

    public static void setOgr_sayisi(int ogr_sayisi) {
        Ogrenci.ogr_sayisi = ogr_sayisi;
    }

}
