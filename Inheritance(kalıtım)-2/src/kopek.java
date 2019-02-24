
public class kopek extends Hayvan {

    private int dis_sayisi;

    public kopek(String ad, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {

        super(ad, kilo, boy, bacak_sayisi);
        this.dis_sayisi = dis_sayisi;
    }

    public void harekete_gec(int hiz) {//miras aldığımız sınıftaki harekete geç metodunu geçersiz kılıp kendi metodumuzu yazdık
        System.out.println("Köpek " + hiz + " hızında koşuyor");
    }

    public void kos(int hiz) {
        System.out.println("Köpek koşuyor");
        harekete_gec(hiz);//override edip şu an ki classtaki harekete geç metodu çağırılıyor.

    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
}
