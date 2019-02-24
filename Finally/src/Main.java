
public class Main {

    public static void main(String[] args) {
        try {
            int a = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Sayılar 0 a bölünemez");
        } catch (NullPointerException e) {
            System.out.println("Null referans hatası");
        } finally {//hata olsa da olmasa da burası çalışır
            System.out.println("Finally bloğu çalışıyor");
        }
    }
}
