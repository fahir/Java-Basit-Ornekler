
public class Main {

    public static void main(String[] args) {
        String a = "Fahir";
        String b = new String("mehÖmet");
//        System.out.println(b + " kelimesinde " + b.length() + " adet harf bulunuyor");//string uzunuluğunu bulma
//        System.out.println("ilk harf:" + b.charAt(0));//metnin istenen indexteki harfini seçme
//        System.out.println("son harf:" + b.charAt(b.length() - 1));
        /*for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }*/
 /*System.out.println(b.startsWith("me"));//b değişkeni Öz(harf duyarlı) ile mi başlıyor
        System.out.println(b.endsWith("et"));////b değişkeni ay(harf duyarlı) ile mi bitiyor
        System.out.println(b.indexOf("e"));//aranan harfin(e) baştan  ilk indexini verir
        System.out.println(b.lastIndexOf("e"));//aranan harfin(e) sondan ilk indexini verir
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());*/
 /*String c = "1453";
        int d = Integer.parseInt(c);//Stringi inte çevirdik
        System.out.println(d);*/
 /*  int e = 158;
        String f = String.valueOf(e);//inti stringe çevirdik
        System.out.println(f);
         */
        String a1 = "Fahir";
        String a2 = "Fahir";
        if (a1 == a2) {//kendileri eşitmi
            System.out.println("Eşitler");
        }
        String b1 = new String("özbay");
        String b2 = new String("özbay");
        if (b1.equals(b2)) {//içerikleri eşitmi eşitliği equals ile kontrol et hep
            System.out.println("Eşitler");
        }
    }
}
