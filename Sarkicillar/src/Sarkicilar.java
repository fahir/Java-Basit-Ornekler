
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author win
 */
public class Sarkicilar {

    private ArrayList<String> liste = new ArrayList<String>();

    public void sarkicilari_bastir() {
        System.out.println(liste.size() + " adet şarkıcı var");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println((i + 1) + ". şarkıcı " + liste.get(i));
        }
    }

    public void s_ekle(String isim) {
        liste.add(isim);
        System.out.println(isim + " adlı şarkıcı listeye ekledi");
    }

    public void s_guncelle(String yeni, int index) {
        liste.set(index, yeni);
        System.out.println("şarkıcı " + yeni + " ile değiştirildi");

    }

    public void s_sil(int index) {
        String isim = liste.get((index - 1));
        liste.remove(index);
        System.out.println(isim + " adlı şarkıcı silindi");

    }

    public void s_ara(String isim) {
        int index = liste.indexOf(isim);
        if (index >= 0) {
            System.out.println(isim + " adlı şarkıcı " + (index + 1) + ". sırada");
        } else {
            System.out.println(isim + " adlı şarkıcı bulunamadı");
        }
    }
}
