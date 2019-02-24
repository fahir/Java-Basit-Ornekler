
public class Draciel extends Beyblade {

    private String kutsal;

    public Draciel(String kullanici, int hiz, int guc, String kutsal) {
        super(kullanici, hiz, guc);
        this.kutsal = kutsal;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(getKullanici() + " adlı kullanıcının kutsal canvarı:" + kutsal);
    }

    @Override
    public void kutsalcik() {
        System.out.println(getKullanici() + " adlı kullanıcının özel saldırısı:Kale savunması");
    }

}
