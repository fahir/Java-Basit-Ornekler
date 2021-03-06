
public class Makmuh implements Imuhendis, Icalisma {//birden fazla arayüz implement edildi

    @Override
    public void calis() {
        System.out.println("Makine mühendisi çalışıyor");
    }

    private boolean askerlik;
    private boolean sicil;

    public Makmuh(boolean askerlik, boolean sicil) {
        this.askerlik = askerlik;
        this.sicil = sicil;
    }

    @Override
    public void asker_durum() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım");
        } else {
            System.out.println("Askerliğimi yapmadım");
        }
    }

    @Override
    public String mezun_drc(double derece) {
        return "Ortalamam " + derece;
    }

    @Override
    public void sicil_sorgula() {
        if (sicil) {
            System.out.println("Adli sicil kaydım var");
        } else {
            System.out.println("Adli sicil kaydım yok");
        }
    }

    @Override
    public void is(String[] array) {
        if (array.length > 0) {
            System.out.println("Makine mühendisi olarak listedeki şirketlerde çalıştım");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            System.out.println("Herhangi bir işim yok");

        }
    }

    public void referans_getir(String[] array) {
        if (array.length > 0) {
            System.out.println("Referanslarım");

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }

        } else {
            System.out.println("Henhangi bir referansım yok");

        }
    }
}
