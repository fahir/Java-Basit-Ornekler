
public class Kare extends Sekil {

    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public void alan_hesapla() {
        System.out.println(getIsim() + " adlı şeklin alanı " + (kenar * kenar));
    }

}
