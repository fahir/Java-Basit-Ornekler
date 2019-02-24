/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konsoldan.girilen.bilgide.hata.ayıklama;

import java.util.Scanner;


/**
 *
 * @author win
 */
public class KonsoldanGirilenBilgideHataAyıklama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int yas =scanner.nextInt();//girilen yaşı alıyor
        scanner.nextLine();//dummy bu diğer satıra geçiyor ve isim girebilme imkanı veriyor bize
        String isim= scanner.nextLine();//girilen ismi alıacak fakat  üste girilen değerle beraber bir satır daha geliyor
        /*bu gelen satırı almadan isim girebilmek için 
        */
       
        System.out.println("Yaşınız: "+yas);
        System.out.println("İsminiz: "+isim);
        
    }
    
}
