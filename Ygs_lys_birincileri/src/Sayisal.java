
public class Sayisal extends Aday {

    public Sayisal(int tr, int mat, int ede, int fiz, String isim) {
        super(tr, mat, ede, fiz, isim);
    }

    @Override
    public int puanhesapla() {
        return getTr() * 5 + getMat() * 5 + getFiz() * 4 + getEde() * 1;
    }

}
