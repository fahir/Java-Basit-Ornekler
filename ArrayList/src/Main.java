
import java.util.ArrayList;

public class Main {

    public static void yazdir(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println((i + 1) + ". eleman " + a.get(i));
        }

    }

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Metalica");
        arraylist.add("Müslüm");
        arraylist.add("Baba");
        arraylist.add("Gürses");
        arraylist.add("Baba");

        //   System.out.println(arraylist.size());//arraylist boyutu sorgulama
        //  System.out.println(arraylist.get(0));//arraylistin 0. elemanı
        // arraylist.remove("Metalica");//içeren değeri indexi sil
        // arraylist.remove(0);// belirtilen indexi sil
        // System.out.println(arraylist.indexOf("Baba"));//Baba değerini içeren ilk indexi veriyor
        //System.out.println(arraylist.lastIndexOf("Baba"));//Baba değerini içeren son indexi veriyor
        /* for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }*/
        //arraylist.set(0, "Garipler");//0. indexine garipler değerini ata güncelle
        yazdir(arraylist);
    }

}
