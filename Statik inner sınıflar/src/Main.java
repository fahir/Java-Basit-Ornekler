
public class Main {

    public static void main(String[] args) {
        Mat.alan alan = new Mat.alan();//static olduğu için mat sınıfı oluşturmadan direk alan nesnesini oluşturduk
        alan.daire_alan(5);
        Mat.alan.daire_alan(6);//metod statik olduğunda bu şekilde kullanabiliryoruz
    }
}
