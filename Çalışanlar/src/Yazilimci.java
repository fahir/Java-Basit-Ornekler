/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Yazilimci extends Calisan {//calisandan miras aldık

    private String diller;//ek özellik ekledik

    public Yazilimci(String Ad, String Soyad, int id, String diller) {//constructure ile bilgilere eriştk
        super(Ad, Soyad, id);//mirastaki değerler
        this.diller = diller;//eklediğimiz değer
    }

    public void formatAt(String os) {
        System.out.println(getAd() + " " + os + " işletim sistemini kuruyor");

    }

    @Override
    public void bilgilerigoster() {//calisandaki bilgileri goster metodunu override ettik ve istediğimiz gibi değiştirdik
        super.bilgilerigoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Yazılımcının bildiği diller:" + diller);
    }

}
