
import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String> {

    public class kumandaIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index >= kanallar.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public String next() {
            String kanal = kanallar.get(index);
            index++;
            return kanal;
        }

    }

    @Override
    public Iterator<String> iterator() {
        return new kumandaIterator();
    }

    private ArrayList<String> kanallar = new ArrayList<>();

    public void kanalEkle(String kanal) {
        kanallar.add(kanal);
    }

    public void kanalSil(String kanal) {
        if (kanallar.contains(kanal)) {
            System.out.println(kanal + " isimli kanal silindi");
            kanallar.remove(kanal);

        } else {
            System.out.println("Kanal bulunamadı");
        }
    }

    public int kanalSayisi() {
        return kanallar.size();
    }
}
