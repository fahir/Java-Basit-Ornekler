/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringler;

/**
 *
 * @author win
 */
public class Stringler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "Fahir "
                +"ÖZBAY "
                +"urfa";
        System.out.println(a);
        // (\t) 4 boşluk bırakır
        System.out.println("merhaba\tFahir");
        // (\n) bir alt satıra geçer
        System.out.println("merhaba\nFahir");
    }
    
}
