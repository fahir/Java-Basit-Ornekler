
import com.fahir.mat.*;//önceden oluşturduğumuz jar dosyasını libraries klasörüne ekledik ve bu classa import ettik.

public class Main {

    public static void main(String[] args) {
        Mat matematik = new Mat();
        matematik.toplama(3, 5);
        matematik.bolme(8, 3);
        matematik.carpma(8, 9);
        matematik.cikarma(8, 5);
    }
}
