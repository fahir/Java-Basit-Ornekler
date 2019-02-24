/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Calisan {

    private String Ad;
    private String Soyad;
    private int id;

    public Calisan(String Ad, String Soyad, int id) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.id = id;
    }

    public void bilgilerigoster() {
        System.out.println("Çalışan bilgileri");
        System.out.println("Ad:" + Ad);
        System.out.println("Soyad:" + Soyad);
        System.out.println("id:" + id);
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
