
public abstract class Sekil {

    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Sekil(String isim) {
        this.isim = isim;
    }

    public void isim_soyle() {
        System.out.println("Seçilen obje " + isim);
    }

    abstract void alan_hesapla();
}
