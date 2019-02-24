
public class Daire extends Sekil {

    private int y_cap;

    public Daire(String isim, int y_cap) {
        super(isim);
        this.y_cap = y_cap;
    }

    @Override
    public void alan_hesapla() {
        System.out.println(getIsim() + " şeklinin alanı " + (Math.PI * y_cap * y_cap));
    }

}
