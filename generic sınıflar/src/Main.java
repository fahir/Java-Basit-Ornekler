
public class Main {

    public static void main(String[] args) {
        Character[] char_dizi = {'J', 'A', 'V', 'A'};
        Integer[] int_dizi = {1, 2, 3, 4, 5, 6};
        String[] str_dizi = {"C#", "Sql", "Vb", "Pyton"};
        Ogrenci[] ogr_dizi = {new Ogrenci("Fahir"), new Ogrenci("Ayşe"), new Ogrenci("eryon")};

        yazdirmasinifi<String> yazdir_string = new yazdirmasinifi<>();
        yazdirmasinifi<Character> yazdir_char = new yazdirmasinifi<>();
        yazdirmasinifi<Integer> yazdir_int = new yazdirmasinifi<>();
        yazdirmasinifi<Ogrenci> yazdir_ogr = new yazdirmasinifi<>();

        yazdir_char.yazdir(char_dizi);
        yazdir_int.yazdir(int_dizi);
        yazdir_string.yazdir(str_dizi);
        yazdir_ogr.yazdir(ogr_dizi);

    }

}
