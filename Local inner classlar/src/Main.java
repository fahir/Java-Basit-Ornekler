
public class Main {

    public static void main(String[] args) {

        class alan {//local inner clas.dışarıdan erişilemez.değişken gibi

            public void d_alan(int ycap) {
                System.out.println("Dairenin alanı " + (ycap * ycap * Math.PI));
            }
        }
        alan alan = new alan();
        alan.d_alan(85);
        alan alan2 = new alan();
        alan2.d_alan(3);
    }

    public static void deneme() {

    }
}
