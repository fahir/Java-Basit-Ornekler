
public class Hayvan {

    private String ad;
    private int kilo;
    private int boy;
    private int bacak_sayisi;

    public Hayvan(String ad, int kilo, int boy, int bacak_sayisi) {
        this.ad = ad;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
    } public void besle()
    {
        System.out.println("Hayvan besleniyor...");
        
    }
    public void harekete_gec(int hiz){
    
        System.out.println("Hayvan "+hiz+" hızında hareket ediyor");
            }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }
    
}
