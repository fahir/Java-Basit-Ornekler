/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iki.sayını.değeirini.değiştirme;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class İkiSayınıDeğeiriniDeğiştirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        System.out.print("birinci Sayı: ");
        sayi1=scanner.nextInt();
        System.out.print("İkinci Sayı: ");
        sayi2=scanner.nextInt();
        System.out.print("Girdiğiniz ilk sayı "+sayi1+" ikinci sayı "+sayi2);

    }
    
}
