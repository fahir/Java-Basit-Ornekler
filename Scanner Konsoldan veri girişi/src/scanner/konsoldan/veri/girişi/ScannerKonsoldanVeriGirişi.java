/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner.konsoldan.veri.girişi;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class ScannerKonsoldanVeriGirişi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lğtefn bir kelim girin: ");
        String yazi=scanner.nextLine();
        System.out.println("Girdiğiniz kelime: "+yazi);

        System.out.println("Lütfen  Yaşınızı girin: ");
        int yas =scanner.nextInt();
        System.out.println("Yaşınız: "+yas);
        System.out.println("Lütfen sayı giriniz");
        double sayi= scanner.nextDouble();
        System.out.println("Girdiğiniz sayı: "+(double)sayi);//virgüllü yazsa da yazmasa da virgüllüye çevirir
        if(scanner.hasNextInt())//girilen değer integer mı kontrol et
        {
                    System.out.println("Lğtfen bir sayı girin");
                    int sayikontrol=scanner.nextInt();
                    System.out.println("Girdiğiniz sayı: "+sayikontrol);

        }else{
            System.out.println("Sayı girmediniz.");
        }

    }
    
}
