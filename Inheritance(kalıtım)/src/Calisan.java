
public class Calisan {//Suoer class veya Base class

    private String Ad;
    private double maas;
    private String departman;

    public Calisan(String Ad, double maas, String departman) {
        this.Ad = Ad;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis() {
        System.out.println("Çalışan Çalışıyor");
    }

    public void bilgilerigoster() {

        System.out.println("Ad:" + Ad);
        System.out.println("Maaş:" + maas);
        System.out.println("Departman:" + departman);

    }

    public void departman_degistir(String yenidepartman) {
        System.out.println("Departman değiştiriliyor");
        this.departman = yenidepartman;
        System.out.println("Yeni departman:" + this.departman);
    }

    /**
     * @return the Ad
     */
    public String getAd() {
        return Ad;
    }

    /**
     * @param Ad the Ad to set
     */
    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    /**
     * @return the maas
     */
    public double getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(double maas) {
        this.maas = maas;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
