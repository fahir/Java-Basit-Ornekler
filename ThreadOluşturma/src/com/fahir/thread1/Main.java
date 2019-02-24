package com.fahir.thread1;

public class Main {

    public static void main(String[] args) {
        Printer p1 = new Printer("printer1");
        Printer p2 = new Printer("printer2");
        p1.start();
        p2.start();
        System.out.println("Main thread çalışıyor");

    }
}
