/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package üni.not.ortalaması;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class ÜniNotOrtalaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c = 0;
        double sonuc = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk vize");
        a = scanner.nextInt();
        System.out.println("İkinci vize");
        b = scanner.nextInt();
        System.out.println("Final");
        c = scanner.nextInt();
        sonuc = (a * 0.3) + (b * 0.3) + (c * 0.4);
        System.out.println("Not ortalamanız " + sonuc);

    }

}
