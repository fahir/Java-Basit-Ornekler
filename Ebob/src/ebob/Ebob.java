
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebob;

/**
 *
 * @author win
 */
public class Ebob {

    /**
     * @param args the command line arguments
     */
    public static int ebob(int a, int b) {

        int sonuc = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                sonuc = i;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(ebob(785, 589));
    }

}
