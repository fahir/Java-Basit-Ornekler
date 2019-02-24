/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Account {

    private String HesapNo;
    private double Bakiye;
    private String Ad;
    private String Email;
    private String Tel;

    public Account() {//varsayılan değerleri belirlllemek için metod oluşturduk
        /* this.HesapNo="Bilgi Yok";
    this.Bakiye=0.0;
    this.Ad="Bilgi yok";
    this.Email="Bilgi yok";
    this.Tel="bilgi yok";*/

        this("Bigi yok", 0.0, "Bilgi yok", "Bilgi yok", "Bilgi yok");//varsayılan değerleri belirledik

    }

    public void bilgilerigoster() {
        System.out.println("Hesap No:" + this.HesapNo
                + "\nAd:" + this.Ad
                + "\nBakiye:" + this.Bakiye
                + "\nTelefon Numarası:" + this.Tel
                + "\nEmail Adresi" + this.Email);
    }

    public Account(String Ad, String Email, String Tel) {//3 pararametre alıyor
        /*  this.Ad = Ad;
        this.Email = Email;
        this.Tel = Tel;
        this.Bakiye = 0.0;
        this.HesapNo = "Bilgi yok";*/
        this("Bilgi Yok", 0.0, Ad, Email, Tel);//olmayan değerleri varsayılan olarak belirliyor
    }

    public Account(String HesapNo, double Bakiye, String Ad, String Email, String Tel) {
        this.HesapNo = HesapNo;
        this.Bakiye = Bakiye;
        this.Email = Email;
        this.Tel = Tel;
        this.Ad = Ad;
    }

    /**
     * @return the HesapNo
     */
    public String getHesapNo() {
        return HesapNo;
    }

    /**
     * @param HesapNo the HesapNo to set
     */
    public void setHesapNo(String HesapNo) {
        this.HesapNo = HesapNo;
    }

    /**
     * @return the Bakiye
     */
    public double getBakiye() {
        return Bakiye;
    }

    /**
     * @param Bakiye the Bakiye to set
     */
    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
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
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Tel
     */
    public String getTel() {
        return Tel;
    }

    /**
     * @param Tel the Tel to set
     */
    public void setTel(String Tel) {
        this.Tel = Tel;
    }
}
