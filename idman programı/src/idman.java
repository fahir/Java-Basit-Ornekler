/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareket_yap(String hareket_turu, int adet) {

        if (hareket_turu.equals("Burpee")) {
            burpeeYap(adet);

        } else if (hareket_turu.equals("Pushup")) {
            pushupYap(adet);

        } else if (hareket_turu.equals("Situp")) {
            situpYap(adet);

        } else if (hareket_turu.equals("Squat")) {
            squatYap(adet);

        } else {
            System.out.println("Geçersiz hareket");
        }

    }

    public void burpeeYap(int adet) {
        if (burpee_sayisi == 0) {
            System.out.println("Yapacka burpee kalmadı");
        }
        if (burpee_sayisi - adet < 0) {
            System.out.println("Tebrikler hedefi geçtin");
            burpee_sayisi = 0;
            System.out.println("Kalan burpee :" + burpee_sayisi);
        } else {
            burpee_sayisi -= adet;
            System.out.println("Kalan burpee:" + burpee_sayisi);
        }

    }

    public void pushupYap(int adet) {
        if (pushup_sayisi == 0) {
            System.out.println("Yapacka pushup kalmadı");
        }
        if (pushup_sayisi - adet < 0) {
            System.out.println("Tebrikler hedefi geçtin");
            pushup_sayisi = 0;
            System.out.println("Kalan pushup :" + pushup_sayisi);
        } else {
            pushup_sayisi -= adet;
            System.out.println("Kalan pushup:" + pushup_sayisi);
        }

    }

    public void situpYap(int adet) {
        if (situp_sayisi == 0) {
            System.out.println("Yapacka situp kalmadı");
        }
        if (situp_sayisi - adet < 0) {
            System.out.println("Tebrikler hedefi geçtin");
            situp_sayisi = 0;
            System.out.println("Kalan situp :" + situp_sayisi);
        } else {
            situp_sayisi -= adet;
            System.out.println("Kalan situp:" + situp_sayisi);
        }

    }

    public void squatYap(int adet) {
        if (squat_sayisi == 0) {
            System.out.println("Yapacka squat kalmadı");
        }
        if (squat_sayisi - adet < 0) {
            System.out.println("Tebrikler hedefi geçtin");
            squat_sayisi = 0;
            System.out.println("Kalan squat :" + squat_sayisi);
        } else {
            squat_sayisi -= adet;
            System.out.println("Kalan squat:" + squat_sayisi);
        }

    }

    public boolean idmanBittiMi() {
        return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);//tüm ypaıalcaklar bitti ise true döndür
    }
}
