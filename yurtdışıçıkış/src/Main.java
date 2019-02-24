
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
            if (yolcu1.harc() == false) {
                System.out.println(mesaj);
                continue;//döngünün başına git

            }
            System.out.println("Yurt dışı yasağı kontrol ediliyor");
            Thread.sleep(3000);
            if (yolcu1.yasak() == false) {
                System.out.println(mesaj);
                continue;//döngünün başına git

            }
            System.out.println("Vizi durumu kontrol ediliyor");
            Thread.sleep(3000);
            if (yolcu1.vize() == false) {
                System.out.println(mesaj);
                continue;
            }
            System.out.println("İşlemleriniz tamamlandı");
            break;
        }

    }
}
