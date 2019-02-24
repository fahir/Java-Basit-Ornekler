
public class gelismis_abone {

    private String isim;
    private int bakiye = 120;
    private String sehir;

    public gelismis_abone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
        this.sehir = sehir;
    }

    public void kullan(int miktar) {
        if ((this.bakiye - miktar) < 0) {
            System.out.println("Yetersiz bakiye");

        } else {
            this.bakiye -= miktar;
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmiştir.");
            } else {
                System.out.println("Güncel bakiyeniz:" + bakiye);
            }
        }
    }

    public void bakiye_sor() {
        System.out.println("güncel Bakiyeniz " + bakiye);
    }
}
