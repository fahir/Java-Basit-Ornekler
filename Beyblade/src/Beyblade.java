
public class Beyblade {

    private String kullanici;
    private int hiz;
    private int guc;

    public Beyblade(String kullanici, int hiz, int guc) {
        this.kullanici = kullanici;
        this.hiz = hiz;
        this.guc = guc;
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public int getGuc() {
        return guc;
    }

    public void setGuc(int guc) {
        this.guc = guc;
    }

    public void saldir() {
        System.out.println(kullanici + " " + guc + " ve " + hiz + " ile saldırıyor");

    }

    public void kutsalcik() {
        System.out.println("Bu beyblade in kutsalı yok");
    }

    public void bilgilerigoster() {
        System.out.println("Kullanıcı:" + kullanici);
        System.out.println("Saldırı gücü:" + guc);
        System.out.println("Hız:" + hiz);
    }
}
