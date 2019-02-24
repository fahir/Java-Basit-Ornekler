/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bede.kitle.indeksi.hesapla;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class BedeKitleIndeksiHesapla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Lütfen kilonuzu girin: ");//println alt satıra geç print aynı satırda al
        Scanner scanner= new Scanner(System.in);
        int kilo=scanner.nextInt();
        System.out.print("Lütfen boyunuzu girin (Örnek 1,72) ");
        double boy=scanner.nextDouble();
        System.out.print("Beden kitle indeksiniz "+(kilo)/(boy*boy));


    }
    
}
