
public class Sayisal extends Aday {

    public Sayisal(int tr, int mat, int ede, int fiz) {
        super(tr, mat, ede, fiz);
    }

    @Override
    public int puanhesapla() {
        return getTr() * 5 + getMat() * 5 + getFiz() * 4 + getEde() * 1;
    }

}
