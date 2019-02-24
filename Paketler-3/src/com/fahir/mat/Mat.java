package com.fahir.mat;

public class Mat implements IMat {

    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplam:" + (a + b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Çıkarma:" + (a - b));

    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("çarpma:" + (a * b));

    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("bölme:" + ((double) a / b));

    }

}
