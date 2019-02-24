/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statik.tekrar;

/**
 *
 * @author Win
 */
public class Statik {

    private static String isim;
    public static int objeSayisi = 0;

    public Statik(String isim) {
        objeSayisi++;
        this.isim = isim;
    }

    public static String getIsim() {
        return isim;
    }
}
