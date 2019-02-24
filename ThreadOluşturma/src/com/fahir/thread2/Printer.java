package com.fahir.thread2;

public class Printer implements Runnable {

    private String isim;

    @Override
    public void run() {
        System.out.println(isim + " çalışıyor");

        for (int i = 1; i < 10; i++) {
            try {
                System.out.println(isim + " yazıyor " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye uğradı");
            }
        }
        System.out.println(isim + " işini bitirdi.");
    }

    public Printer(String isim) {
        this.isim = isim;
    }

}
