
public class Problem {

    public static class Mat {

        public static void d_alan(int ycap) {
            System.out.println("Dairenin alanı:" + (ycap * ycap * Math.PI));
        }

        public static void ucgen_cev(int kenar1, int kenar2, int kenar3) {
            System.out.println("Üçgenin çevresi " + (kenar1 + kenar2 + kenar3));
        }
    }

    public static class fizik {

        public static void ic_carp(vek vek1, vek vek2) {
            int ic_carpim = vek1.getI() * vek2.getI() + vek1.getJ() * vek2.getJ() + vek1.getK() * vek2.getK();
            System.out.println(vek1.getIsim() + " ile " + vek2.getIsim() + " iç çarpımı " + ic_carpim);

        }
    }
}
