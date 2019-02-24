package hesap.makinesi;

import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b = 0;
		double sonuc = 0;
		String islemler = "1. Topla\n" + "2. Çıkar\n" + "3. Çarp\n" + "4. Böl";
		System.out.println(islemler);
		System.out.println("Kullanmak istediğinizi işlemi seçin");
		String islem = scanner.nextLine();
		switch (islem) {
		case "1":
			System.out.println("İlk sayı:");
			a = scanner.nextInt();
			System.out.println("İkinci sayı:");
			b = scanner.nextInt();
			sonuc = (a + b);// topla
			break;
		case "2":
			System.out.println("İlk sayı:");
			a = scanner.nextInt();
			System.out.println("İkinci sayı:");
			b = scanner.nextInt();
			sonuc = (a - b);
			break;
		case "3":
			System.out.println("İlk sayı:");
			a = scanner.nextInt();
			System.out.println("İkinci sayı:");
			b = scanner.nextInt();
			sonuc = (a * b);
			break;
		case "4":
			System.out.println("İlk sayı:");
			a = scanner.nextInt();
			System.out.println("İkinci sayı:");
			b = scanner.nextInt();
			sonuc = ((double) a / b);
			break;

		}
		System.out.println("İşlem sonucu " + sonuc);

	}
}
