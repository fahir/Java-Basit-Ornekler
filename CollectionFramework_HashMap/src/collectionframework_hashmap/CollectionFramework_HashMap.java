/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionframework_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Win
 */
public class CollectionFramework_HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(20, "C++");
        hashMap.put(50, "Vb.net");
        /* System.out.println(hashMap);
        System.out.println(hashMap.get(10));*/
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Ahantar:" + entry.getKey() + " ----->Değer:" + entry.getValue());
        }

    }

}
