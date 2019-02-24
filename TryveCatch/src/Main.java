
public class Main {

    public static void main(String[] args) {
        /*  try {
            int a = 1 / 0;// unchecked exception
        } catch (Exception_turu e) {
            System.out.println("Her hangi bir sayı 0 a bölünemez");
        }*/

 /* int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[6]);*/
        // System.out.println("Burası çalışıyor");
        try {
            int a = 30 / 0;//aritmetic exception

            int[] b = {1, 2, 3, 4, 5};
            System.out.println(b[6]);
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı 0 a bölünemez");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizinin boyunu aştınız");
        } catch (Exception e) {
            System.out.println("Bir hata oluştu");
            e.printStackTrace();
        }
        System.out.println("Burası çalışıyor");
    }
}
