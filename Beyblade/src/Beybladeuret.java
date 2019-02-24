
public class Beybladeuret {

    public Beyblade Beybladeurt(String bey_turu) {//beyblade turunde nesne döndürecek geri
        if (bey_turu.equals("Dragon")) {
            return new Dragon("Takao", 250, 500, "mavi ejdahı", "Kutsal canvarla konuşma");
        } else if (bey_turu.equals("Draciel")) {
            return new Draciel("Max", 240, 450, "");
        } else if (bey_turu.equals("Drayga")) {
            return new Drayga("Rei", 245, 460, "Beyaz Kaplan");

        } else if (bey_turu.equals("Dranza")) {
            return new Dranza("Kai", 246, 470, "Kırmızı Anka");
        } else {
            return null;
        }
    }
}
