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

        araba1.setModel("bora");
        araba1.setTekerlek(8);
        System.out.println("Arabanın modeli " + araba1.getModel());
        System.out.println("Arabanın tekerlek sayısı " + araba1.getTekerlek());
    }
}
