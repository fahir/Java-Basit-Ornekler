
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void mapYazdir(Map<Integer, String> map) {
        map.put(10, "Java");
        map.put(3, "Css");
        map.put(20, "Js");
        map.put(4, "Html");
        /*  for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }*/
        // System.out.println(map.keySet());
        /*  for (Integer key : map.keySet()) {
            System.out.println("Key:" + key + " Value:" + map.get(key));
        }*/
        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println("Değer:" + s);
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedhashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treehashMap = new TreeMap<Integer, String>();
        mapYazdir(hashMap);
        mapYazdir(linkedhashMap);
        mapYazdir(treehashMap);
    }
}
