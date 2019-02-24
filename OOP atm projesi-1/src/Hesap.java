/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Hesap {

    private String Kadi;
    private String Parola;
    private double Bakiye;

    public Hesap(String Kadi, String Parola, double Bakiye) {
        this.Kadi = Kadi;
        this.Parola = Parola;
        this.Bakiye = Bakiye;
    }

    public String getKadi() {
        return Kadi;
    }

    public void setKadi(String Kadi) {
        this.Kadi = Kadi;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String Parola) {
        this.Parola = Parola;
    }

    public double getBakiye() {
        return Bakiye;
    }

    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
    }

    public void yatir(double tutar) {
        this.Bakiye += tutar;
        System.out.println("Güncel bakiyeniz " + this.Bakiye);

    }

    public void cek(double tutar) {
        if (this.Bakiye < tutar) {
            System.out.println("Yetersiz bakiye.Bakiyeniz: " + this.Bakiye);
        } else if (tutar > 1500) {
            System.out.println("Günde en fazla 1500 tl çekeblirsiniz");

        } else {
            this.Bakiye -= tutar;
            System.out.println("Güncel bakiyeniz:" + this.Bakiye);

        }
    }
}
