package hipotenüs.bulma;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class HipotenüsBulma {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.print("Lütfen ilk kenarı girin: ");
		a = scanner.nextInt();
		System.out.print("Lütfen ikinci kenarı girin: ");
		b = scanner.nextInt();
		System.out.print("Hipotenüs: " + ((double) Math.sqrt((a * a) + (b * b))));// Math.sqrt karekök alıyor
	}

}
