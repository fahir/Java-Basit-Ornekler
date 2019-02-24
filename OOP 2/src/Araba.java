/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Araba {//araba nesnesi oluşturduk

    private String renk;//içerdiği özellikleri belirledik
    private int kapilar;
    private int tekerlek;
    private String motor;
    private String model;

    public void setModel(String model) {//private olan değişkenlere değer atamak için bu metod tanımlanıyor
        this.model = model;//this bu classtaki model değişkeninin belirtiyor

    }

    public String getModel() {//bu metod ile model özelliğine atanan değer döndürülüyor
        return this.model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        if (kapilar < 0) {//kapı sayısı 0dan küçükse
            System.out.println("Kapı sayısı 0 dan küçük olamaz");
        } else {//şartlar sağlanmıyorsa
            this.kapilar = kapilar;

        }
    }

    /**
     * @return the tekerlek
     */
    public int getTekerlek() {
        return tekerlek;
    }

    /**
     * @param tekerlek the tekerlek to set
     */
    public void setTekerlek(int tekerlek) {
        if (tekerlek < 4) {
            System.out.println("Tekerler sayısı4 ten küçük olamaz ");
        } else {
            this.tekerlek = tekerlek;
        }
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

}
