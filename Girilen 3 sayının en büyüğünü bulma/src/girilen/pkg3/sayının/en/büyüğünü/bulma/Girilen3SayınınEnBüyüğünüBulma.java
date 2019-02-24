/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen.pkg3.sayının.en.büyüğünü.bulma;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class Girilen3SayınınEnBüyüğünüBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, maks;
        maks = -1;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a >= b && a >= c) {
            maks = a;
        } else if (b >= a && b >= c) {
            maks = b;
        } else {
            maks = c;
        }
        System.out.println("En büyük sayı " + maks);

    }

}
