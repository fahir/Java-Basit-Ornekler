
public abstract class Aday {

    private int tr;
    private int mat;
    private int ede;
    private int fiz;
    private String isim;

    public Aday(int tr, int mat, int ede, int fiz, String isim) {
        this.tr = tr;
        this.mat = mat;
        this.ede = ede;
        this.fiz = fiz;
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTr() {
        return tr;
    }

    public void setTr(int tr) {
        this.tr = tr;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getEde() {
        return ede;
    }

    public void setEde(int ede) {
        this.ede = ede;
    }

    public int getFiz() {
        return fiz;
    }

    public void setFiz(int fiz) {
        this.fiz = fiz;
    }

    abstract int puanhesapla();

}
