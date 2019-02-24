/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Test {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(1204, 768);
        Monitor monitor = new Monitor("qwer", "LG", "25", resolution);
        Kasa kasa = new Kasa("Atx", "COmpusa", "Teneke");
        Anakart anakart = new Anakart("G31-em", "Gigabyte", 5, "Kali");
        Bilgisayar pc = new Bilgisayar(anakart, kasa, monitor);
        pc.getKasa().bilgisayari_ac();//kasa calsındaki kasayı seç ve biglisayarı aç metodunu çalıştır.
        pc.getMonitor().kapat();
        pc.getAnakart().isletim_sistemi_yukle("Kali");

    }

}
