
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Win
 */
public class SetMain {

    public static void main(String[] args) {
        /*   Set<String> s = new HashSet<>();
        Set<String> s2 = new LinkedHashSet<>();
        Set<String> s3 = new TreeSet<>();
        s.add("Java");
        s.add("C++");
        s.add("C#");
        s.add("Phyton");
        s2.add("Java");
        s2.add("C++");
        s2.add("C#");
        s2.add("Phyton");
        s3.add("Java");
        s3.add("C++");
        s3.add("C#");
        s3.add("Phyton");*/
 /* System.out.println("Hashset***********************************");
        for (String st : s) {
            System.out.println(st);
        }
        System.out.println("LinkedHashset***********************************");

        for (String st : s2) {
            System.out.println(st);
        }
        System.out.println("TreeSet***********************************");

        for (String st : s2) {
            System.out.println(st);
        }*/
 /*System.out.println(s.contains("Go"));//içeriginde Go var mı
        System.out.println(s.contains("Java"));*/// java var mı
        // System.out.println(s.isEmpty());//içi boş mu
        // s.remove("Java");//Java yı sil içinden
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("Java");
        set1.add("C");
        set1.add("C#");
        set1.add("C++");
        set2.add("C#");
        set2.add("C++");
        set2.add("Phyton");
        set2.add("JavaScript");
        Set<String> fark = new HashSet<>(set2);//farkı set 2 ye eşitledik
        System.out.println(fark.removeAll(set1));//set1 in içindekileri farktan sildik
        System.out.println(fark);
        Set<String> kesisim = new HashSet<>(set2);//kesişime set2 nin elemanlarını attık
        System.out.println(kesisim.retainAll(set1));//ortak elemanlar var mı
        System.out.println(kesisim);//ortak elemanları yazdır
    }
}
