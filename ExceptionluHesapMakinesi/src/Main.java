/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author win
 */
class carpmaException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Lütfen sayıları 10000 den küçük girin");
    }

}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b = 0;
        double sonuc = 0;
        String islemler = "1. Topla\n"
                + "2. Çıkar\n"
                + "3. Çarp\n"
                + "4. Böl";
        System.out.println(islemler);
        System.out.println("Kullanmak istediğinizi işlemi seçin");
        String islem = scanner.nextLine();
        try {
            switch (islem) {
                case "1":
                    System.out.print("İlk sayı:");
                    a = scanner.nextInt();
                    System.out.print("İkinci sayı:");
                    b = scanner.nextInt();
                    sonuc = (a + b);//topla
                    System.out.print("İşlem sonucu " + sonuc);

                    break;
                case "2":
                    System.out.print("İlk sayı:");
                    a = scanner.nextInt();
                    System.out.print("İkinci sayı:");
                    b = scanner.nextInt();
                    sonuc = (a - b);
                    System.out.print("İşlem sonucu " + sonuc);

                    break;
                case "3":
                    System.out.print("İlk sayı:");
                    a = scanner.nextInt();
                    System.out.print("İkinci sayı:");
                    b = scanner.nextInt();
                    if (a > 1000 || b > 1000) {
                        throw new carpmaException();
                    }
                    sonuc = (a * b);
                    System.out.print("İşlem sonucu " + sonuc);

                    break;
                case "4":
                    System.out.print("İlk sayı:");
                    a = scanner.nextInt();
                    System.out.print("İkinci sayı:");
                    b = scanner.nextInt();
                    sonuc = (a / b);
                    System.out.print("İşlem sonucu " + sonuc);

                    break;
                default:
                    System.out.print("GEçersiz işlem");

            }
        } catch (ArithmeticException e) {
            System.out.print("Sayı sıfıra bölünemez");

        } catch (InputMismatchException e) {
            System.out.print("Lütfen sadece sayı girin");
        } catch (carpmaException ex) {
            ex.printStackTrace();
        }

    }
}
