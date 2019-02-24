
public class Main {

    public static void main(String[] args) {
        Imuhendis muhendis1 = new Pcmuh(true, false);//Imuhendis interface ini referans gösteriyoruz
        Makmuh muhendis2 = new Makmuh(false, true);//Makmuh classını referans gösteriyoruz sebebi Imuhendis arayüzünde
        //makmuh teki referans getir metoduna erişemiyoruz çünkü Imuhendiste referans getir metodu bulunmuyor
//        muhendis1.asker_durum();
//        muhendis1.sicil_sorgula();
//        System.out.println(muhendis1.mezun_drc(3.95));
//        String[] tecrube = {"Nasa", "NSA", "FBI"};
//        muhendis1.is(tecrube);
        muhendis2.asker_durum();
        muhendis2.sicil_sorgula();
        System.out.println(muhendis2.mezun_drc(4));
        String[] tecrube2 = {"a şirketi", "b şirketi", "c şirketi"};
        muhendis2.is(tecrube2);
        String[] referans = {"a", "b", "c"};
        muhendis2.referans_getir(referans);
        muhendis2.calis();
    }
}
