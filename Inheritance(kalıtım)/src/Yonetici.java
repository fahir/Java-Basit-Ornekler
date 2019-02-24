
public class Yonetici extends Calisan {// çalışan sınıfından yönetici sınıfına tüm özellikleri al

    private int sorumlu_kisi;//çalışan clasında olmayan yni bir özellik ekledik yonetici classına

    public Yonetici(String Ad, double maas, String departman, int sorumlu_kisi) {//yeni özelliği ekledik beklenen değişkenlere
        super(Ad, maas, departman);//Çalışan clasındaki değerlere kendi aldığımız değerleri atadık
        this.sorumlu_kisi = sorumlu_kisi;//gelen değeri atadık sorumlu kişiye

    }

    public void bilgilerigoster() {//çalısan classındaki bilgileri göster metodunu override(geçrsiz kılma) işlemi yaptık
        super.bilgilerigoster();
        System.out.println("Sorumlu olduğu kişi sayısı:" + this.sorumlu_kisi);
//        System.out.println("Ad:" + getAd());
//        System.out.println("Maaş:" + getMaas());
//        System.out.println("Departman:" + getDepartman());

    }

    public void zamYap(double miktar) {
        System.out.println("Çalışanlara " + miktar + " TL zam yapıldı. ");

    }
}
