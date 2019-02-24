
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class buyuktenKucugeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);//comparato küçükten büyüğe sıralıyor eksi ile tersini aldık
    }

}

class kucuktenBuyugeStringPlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());//isimleri karşılaştır
    }

}

class buyuktenBuyugePlayer implements Comparator<Player> {

    public buyuktenBuyugePlayer() {
    }

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return 1;
        } else if (o1.getId() > o2.getId()) {
            return -1;
        }
        return 0;
    }

}

class kucuktenBuyugePlayer implements Comparator<Player> {

    public kucuktenBuyugePlayer() {
    }

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return 1;
        }
        return 0;
    }

}

class Player implements Comparable<Player> {

    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id:" + id + " İsim:" + isim;
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {//küçükse -1
            return -1;
        } else if (this.id > player.id) {//büyükse +1
            return 1;
        }
        return 0;//eşitse 0 gönder

    }
}

public class Main {

    public static void main(String[] args) {
        List<String> list_string = new ArrayList<>();
        list_string.add("Java");
        list_string.add("C");
        list_string.add("Php");
        Collections.sort(list_string);//alfabetik olarak sırala
        /*  for (String s : list_string) {
            System.out.println(s);
        }*/
        List<Player> list_player = new ArrayList<>();
        list_player.add(new Player("Fahir", 1));
        list_player.add(new Player("Ayşe", 500));
        list_player.add(new Player("Şörük", 198));
        Player p1 = new Player("Fahir", 100);
        Player p2 = new Player("Özbay", 15);
        //  System.out.println(p1.compareTo(p2));
        //Collections.sort(list_player, new kucuktenBuyugePlayer());
        //Collections.sort(list_player, new buyuktenBuyugePlayer());
        //Collections.sort(list_player, new kucuktenBuyugeStringPlayer());
        Collections.sort(list_player, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());//isme göre büyükten küçüğe sırala
            }
        });
        for (Player p : list_player) {
            System.out.println(p);
        }
        /* Collections.sort(list_string, new buyuktenKucugeString());
        for (String p : list_string) {
            System.out.println(p);
        }/*
        Set<Player> tree_set = new TreeSet<>();
        tree_set.add(new Player("Fahir", 1));
        tree_set.add(new Player("Ayşe", 500));
        tree_set.add(new Player("Şörük", 198));
        for (Player p : tree_set) {
            System.out.println(p);
        }*/
    }
}
