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

    public Account() {
        System.out.println("kendi yazdığımı yapıcı metod");
    }

    public Account(String HesapNo, double Bakiye, String Ad, String Email, String Tel) {
        this.HesapNo = HesapNo;
        this.Bakiye = Bakiye;
        this.Email = Email;
        this.Tel = Tel;
        this.Ad = Ad;
    }

    public void yatir(double miktar) {
        Bakiye += miktar;
        System.out.println("Yeni bakiye " + Bakiye);
    }

    public void cek(double miktar) {
        if (miktar > 1500 && miktar > Bakiye) {
            System.out.println("Bakiye yetersiz veya günlük limit(1500) aşıldı");
            System.out.println("Şu anki bakiye " + Bakiye);
        } else {
            Bakiye -= miktar;
            System.out.println("Kalan bakiye " + Bakiye);
        }
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
