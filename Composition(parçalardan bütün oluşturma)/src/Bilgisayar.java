
public class Bilgisayar {

    private Anakart anakart;
    private Kasa kasa;
    private Monitor monitor;

    public Bilgisayar(Anakart anakart, Kasa kasa, Monitor monitor) {
        this.anakart = anakart;
        this.kasa = kasa;
        this.monitor = monitor;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

}
