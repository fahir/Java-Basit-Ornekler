/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonksiyonlar.metotlar;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class FonksiyonlarMetotlar {

    /**
     * @param args the command line arguments
     */
    public static void selamlama() {//metod tanımlanıyor

        System.out.println("Merhaba Nasılsınız ?");
        System.out.println("Selamlar");
    }

    public static void faktor() {//metod tanımlanıyor
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("Sayı giriniz");
        a = scanner.nextInt();
        int sonuc = 1;
        while (a > 0) {
            sonuc *= a;
            a--;
        }
        System.out.println("Sonuç: " + sonuc);
    }

    public static void topla(int a, int b, int c) {//int a b c parametrelerini bekliyor

        System.out.println("Toplam:" + (a + b + c));

    }

    public static void karsilama(String isim) {//metod tanımlanıyor String türünde isim adlı parametre bekliyor
        System.out.println("Merhaba " + isim);
    }

    public static int cikar(int a, int b)// aldığı paremetrelier işlemlerden sonra int olarak dönüdürüyor
    {
        return (a - b);
    }

    public static int ikiilecarp(int a) {
        return (a * 2);
    }

    public static int ikiiletopla(int a) {
        return (a + 2);
    }

    public static int dortilecarp(int a) {

        return (a * 4);//return kodundan sonra hiç bir şey çalışmaz break gibi
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
//        String isim;
//        System.out.println("Lütfen isminizi girin");
//        isim = scanner.nextLine();
//        karsilama(isim);
//        int a, b, c = 0;
//        System.out.println("Lütfen ilk sayıyı girin");
//        a = scanner.nextInt();
//        System.out.println("İkinci sayıyı girin");
//        b = scanner.nextInt();
//        System.out.println("Üçüncü sayıyı girin");
//        c = scanner.nextInt();
//        topla(a, b, c);
//        System.out.println("Lütfen ilk sayıyı girin");
//        a = scanner.nextInt();
//        System.out.println("ikinci sayı");
//        b = scanner.nextInt();
//        System.out.println("Sonuc= " + cikar(a, b));

        System.out.println("sonuç " + dortilecarp(ikiiletopla(ikiilecarp(2))));//içiçe metod kullanımı

    }

}
