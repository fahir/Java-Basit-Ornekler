/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class test {

    public static void main(String[] args) {
        Araba araba1 = new Araba();//Araba türünde yeni bir araba tanımladık
        araba1.renk = "Mavi";
        araba1.kapilar = 4;
        araba1.model = "Civic";
        araba1.tekerlek = 4;
        araba1.motor = "2.0";
        System.out.println(araba1.motor);
    }
}
