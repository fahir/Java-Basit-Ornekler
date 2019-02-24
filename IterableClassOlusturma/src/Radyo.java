
import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String> {

    private ArrayList<String> kanallar_list = new ArrayList<>();

    public class RadyoIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < kanallar_list.size()) {
                return true;
            } else {
                return false;
            }

        }

        @Override
        public String next() {
            String deger = kanallar_list.get(index);
            index++;
            return deger;
        }

    }

    public Radyo(String[] kanallar) {
        for (String kanal : kanallar) {
            kanallar_list.add(kanal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        // return kanallar_list.iterator();
        return new RadyoIterator();
    }

}
