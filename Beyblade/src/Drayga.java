
public class Drayga extends Beyblade {

    private String kutsal;

    public Drayga(String kullanici, int hiz, int guc, String kutsal) {
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
        System.out.println(getKullanici() + " adlı kullanıcı " + kutsal + " adlı canavarını çıkardı ");
        System.out.println(getKullanici() + " adlı kullanıcının özel saldırıs:Kaplan pençesi");

    }

}
