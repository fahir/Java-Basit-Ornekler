
public class Anakart {

    private String model;
    private String uretici;
    private int yuva;
    private String isletim_sistemi;

    public Anakart(String model, String uretici, int yuva, String isletim_sistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuva = yuva;
        this.isletim_sistemi = isletim_sistemi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuva() {
        return yuva;
    }

    public void setYuva(int yuva) {
        this.yuva = yuva;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }

    public void isletim_sistemi_yukle(String isletim_sistemi) {
        isletim_sistemi = this.isletim_sistemi;
        System.out.println(isletim_sistemi + " İşletim sistemi yğklendi");

    }
}
