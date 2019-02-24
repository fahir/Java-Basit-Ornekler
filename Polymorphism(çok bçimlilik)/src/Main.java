
class Hayvan {

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konuşuyor";
    }
}

class kedi extends Hayvan {

    public kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " niyavlıyor ";
    }

}

class kopek extends Hayvan {

    public kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor"; //To change body of generated methods, choose Tools | Templates.
    }

}

class at extends Hayvan {

    public at(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor"; //To change body of generated methods, choose Tools | Templates.
    }

}

public class Main {

    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }

    public static void konustur2(Object object) {
        if (object instanceof kopek) {//object nesnesi kopek sınıfndan mı türemiş
            kopek kopek1 = (kopek) object;
            System.out.println(kopek1.konus());
        } else if (object instanceof kedi) {
            kedi kedi1 = (kedi) object;
            System.out.println(kedi1.konus());
        } else if (object instanceof at) {
            at at1 = (at) object;
            System.out.println(at1.konus());
        } else {
            Hayvan hayvan1 = (Hayvan) object;
            System.out.println(hayvan1.konus());
        }
//        System.out.println(object.konus());
    }

    public static void main(String[] args) {
        /* Hayvan hayvan1 = new kedi("kara");//hayvan clasından üretilmiş veye referan alınmış hangi tür üretilecekse o yaızlıyo burda kedi
        System.out.println(hayvan1.konus());
        Hayvan hayvan2 = new kopek("kara baş");
        System.out.println(hayvan2.konus());
        Hayvan hayvan3 = new at("Kara inci");
        System.out.println(hayvan3.konus());*/
        //*****************************************************
//        konustur(new kedi("tekir"));//burası dah pratik
//        konustur(new kopek("kara baş"));
//        konustur(new at("Şahbatur"));

//        if (kopek1 instanceof Hayvan) {//kopek1 nesnesi Hayvan sınıfından mı türemiş
//            System.out.println("Bu nesne Hayvan sınıfında türemiştir");
//        }
        kopek kopek1 = new kopek("karabaş");
        kedi kedi1 = new kedi("tekir");
        at at1 = new at("şahbatur");
        Hayvan hayvan1 = new Hayvan("limon");

        konustur2(kopek1);
        konustur2(kedi1);
        konustur2(at1);
        konustur2(hayvan1);
    }
}
