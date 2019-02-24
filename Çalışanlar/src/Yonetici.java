
public class Yonetici extends Calisan {//çalışansan miras aldık

    private int sorumlu_kisi;//istediğimiz ek özelliği ekledik

    public Yonetici(int sorumlu_kisi, String Ad, String Soyad, int id) {
        super(Ad, Soyad, id);//ana sınıftan(calisandan) aldığımız özellikler
        this.sorumlu_kisi = sorumlu_kisi;//bizim eklediğimiz özellik
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı:" + sorumlu_kisi);
    }

    public void zamYap(double miktar) {
        System.out.println("Çalışanların maaşına " + miktar + " TL zam yapıldı");
    }

}
