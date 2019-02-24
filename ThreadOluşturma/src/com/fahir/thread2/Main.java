package com.fahir.thread2;

public class Main {

    public static void main(String[] args) {
        Thread p1 = new Thread(new Printer("Printer1"));
        Thread p2 = new Thread(new Printer("Printer2"));
        p1.start();
        p2.start();
        System.out.println("Main thread çalışıyor");

    }
}
