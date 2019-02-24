
public class Abone {

    public String ad;
    public int bakiye;
    public String sehir;

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
