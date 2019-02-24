/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilometre.yakıt.hesabı;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class KilometreYakıtHesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Aracınız km de ne kaç tl yakıyor Örn: 0,32 ");
    double kurus=scanner.nextDouble();
    System.out.print("ARacınızla kaç km yol gittiniz ");
    int km=scanner.nextInt();
    System.out.print("Aracınızla "+km+" yol almak için "+(kurus*km)+" TL ödemeniz gerekiyor");
    }
    
}
