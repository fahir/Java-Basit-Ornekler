/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Main {

    public static void main(String[] args) {
//        Hesap hesap1 = new Hesap("Fahir", "123456", 1555.0);
//        hesap1.yatir(1508.85);
//        hesap1.cek(1500);
//        hesap1.cek(1500);
//        hesap1.cek(1500);
        ATM atm = new ATM();

        Hesap hesap = new Hesap("Fahir", "123456", 2005);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor.");

    }
}
