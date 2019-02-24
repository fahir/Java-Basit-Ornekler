
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.isim);
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    private String isim, id;

    public Player(String isim, String id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "----------- Id:" + id + " isim:" + isim;
    }

}

public class Main {

    public static void main(String[] args) {
        Set<Player> hashSet = new HashSet<>();
        Player p1 = new Player("Fahir", "1");
        Player p2 = new Player("Özbay", "2");
        Player p3 = new Player("Fahir", "1");
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        for (Player p : hashSet) {
            System.out.println(p);
        }
    }

}
