
public class EsitAgirlik extends Aday {

    @Override
    public int puanhesapla() {
        return getTr() * 5 + getMat() * 5 + getFiz() * 1 + getEde() * 4;
    }

    public EsitAgirlik(int tr, int mat, int ede, int fiz) {
        super(tr, mat, ede, fiz);
    }

}
