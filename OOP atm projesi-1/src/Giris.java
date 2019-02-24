
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author win
 */
public class Giris {

    public boolean giris(Hesap hesap) {//Hesap türünde bir hesap nesnesi alacak
        Scanner scanner = new Scanner(System.in);
        String Kadi;
        String parola;
        System.out.println("Kullanıcı adı ");
        Kadi = scanner.nextLine();
        System.out.println("Parola ");
        parola = scanner.nextLine();
        if (hesap.getKadi().equals(Kadi) && hesap.getParola().equals(parola)) {//Gelen değerler kayıtlarla aynımı
            return true;//doğru
        } else {
            return false;// yanlış
        }
    }
}
