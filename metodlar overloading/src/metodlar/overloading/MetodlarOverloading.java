/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodlar.overloading;

/**
 *
 * @author win
 */
public class MetodlarOverloading {

    /**
     * @param args the command line arguments
     */
    public static void toplama(String a, String b) {//metodun iki string değişkenli çalışan halini tanımlıyoruz
        System.out.println(a + " " + b);

    }

    public static void toplama(int a, int b) {//metodun iki int değişkenli çalışan halini tanımlıyoruz
        System.out.println("Sonuc " + (a + b));

    }

    public static void toplama(int a, int b, int c) {//metodun iki değişkenli çalışan halini tanımlıyoruz
        System.out.println("Sonuc " + (a + b + c));

    }

    public static void main(String[] args) {
        toplama(5, 8);
        toplama(5, 8, 9);
        toplama("Fahir", "ÖZBAY");

    }

}
