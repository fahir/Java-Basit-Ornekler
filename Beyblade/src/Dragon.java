
public class Dragon extends Beyblade {

    private String kutsal, gizli;

    public Dragon(String kullanici, int hiz, int guc, String kutsal, String gizili) {
        super(kullanici, hiz, guc);
        this.kutsal = kutsal;
        this.gizli = gizili;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(getKullanici() + " adlı kullanıcının kutsal canvarı:" + kutsal);
        System.out.println(getKullanici() + " adlı kullanıcının gizli yeteneği:" + gizli);
    }

    @Override
    public void kutsalcik() {
        System.out.println(getKullanici() + " adlı kullanıcının özel saldırısı:Hayalet kasırgası");
    }

}
