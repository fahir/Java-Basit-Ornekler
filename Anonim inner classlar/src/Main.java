
public class Main {

    public static void main(String[] args) {
        Iogrenci ogrenci = new Iogrenci() {
            @Override
            public void derscalis() {
                System.out.println("Ders çalışıyorum");
            }

            @Override
            public void dersegir() {
                System.out.println("Derse girdim");

            }
        };
        ogrenci.derscalis();
        ogrenci.dersegir();
        System.out.println("-------");
        aogrenci ogrenci2 = new aogrenci("Fahir", 53) {
            @Override
            void kayit_yap() {
                System.out.println("kayıt yapılıyor" + getIsim() + getNumara());
            }
        };
        ogrenci2.kayit_yap();
        ogrenci2.selamla();
    }

    public interface Iogrenci {

        void derscalis();

        void dersegir();

    }

    public static abstract class aogrenci {

        private String isim;
        private int numara;

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }

        public aogrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        abstract void kayit_yap();

        public void selamla() {
            System.out.println("Selamlar" + getIsim() + getNumara());
        }
    }
}
