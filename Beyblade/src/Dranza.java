
public class Dranza extends Beyblade {

    private String kutsal;

    public Dranza(String kullanici, int hiz, int guc, String kutsal) {
        super(kullanici, hiz, guc);
        this.kutsal = kutsal;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal canavar adı:" + kutsal);
    }

    @Override
    public void kutsalcik() {
        System.out.println(getKullanici() + " kullanıcısı " + kutsal + " adlı canavarını ortaya çıkarıyor");
        System.out.println(getKullanici() + " adlı kullanıcısının gizli saldırısı:Alev kılıcı");
    }

}
