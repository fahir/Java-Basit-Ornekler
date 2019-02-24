
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
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};//tek sütun 5 satıre değer alır
        int[][] array2 = new int[2][2];//2 sütun 4 değer alır
        int[][] array3 = {{10, 20}, {30, 40}};//2 sütun 4 değer alır
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array2[i][j] = scanner.nextInt();

            }
        }
        System.out.println("**************************");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println("");
        }
        array2[0][0] = 10;//0. satırırın 0. sütununa 10 değerini ata
        array2[0][1] = 20;
        array2[1][0] = 30;
        array2[1][1] = 40;

    }
}
