
public class Seyirci {

    private static String isim;
    private static int sayi = 0;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Seyirci(String isim) {
        this.isim = isim;
        sayi++;
    }

    public void oyun_seyret() {
        System.out.println(isim + " oyun seyrediyor");
    }

    public static int getSayi() {
        return sayi;
    }
}
