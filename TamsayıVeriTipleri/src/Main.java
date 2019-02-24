/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Main {
    public static void main(String[] args) {
        int a=4;  //32bit uzunluk
        System.out.println(Integer.MIN_VALUE);//En az değer
        System.out.println(Integer.MAX_VALUE);// En çok değer
        byte b=100;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        //short
        System.out.println(Short.MAX_VALUE+" - "+Short.MIN_VALUE);
        //Long
                System.out.println(Long.MAX_VALUE+" - "+Long.MIN_VALUE);
                //byte-->short-->int-->long dönüşür
                System.out.println(a+b);
        byte d=100;
        byte e=(byte)(d/2);//işlemin sonucu hangi tür olursa olsun (byte) ile byte tipine dönüştür
        System.out.println(b);
        
    }
}
