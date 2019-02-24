
public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha gökçen hvlimanına hoş geldiniz.");
        String sartlar = "Yurt dışı çıkış kuralları   \n"
                + "Yurtdışı yasağınız olmamalı\n"
                + "Harç bedelinizi yatırmış olmalısınız\n"
                + "Gideceğiniz ülkenin vizesi bulunmalı";
        String mesaj = "Yurt dışına çıkabilmek için tüm şartları sağlamalısınız";

        while (true) {
            System.out.println("***************************************");
            System.out.println(mesaj);
            System.out.println("***************************************");

            System.out.println(sartlar);
            Yolcu yolcu1 = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor");
            Thread.sleep(3000);//3 saniye bekle
            try {
                yolcu1.harc();
            } catch (harcException e) {
                e.printStackTrace();
                System.out.println(sartlar);
                continue;
            }
            System.out.println("Yurt dışı yasağı kontrol ediliyor");
            Thread.sleep(3000);
            try {
                yolcu1.yasak();
            } catch (siyasiException e) {
                e.printStackTrace();
                System.out.println(sartlar);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor");
            Thread.sleep(3000);
            try {
                yolcu1.vize();
            } catch (vizException e) {
                e.printStackTrace();
                System.out.println(sartlar);
                continue;
            }
            System.out.println("İşlemleriniz tamamlandı");
            break;
        }

    }

}
