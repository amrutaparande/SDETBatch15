package HomeWorkArrayList;
import java.util.Iterator;
import java.util.ArrayList;

/*Create an arrayList of words. Remove every word that ends with “e”. */
public class Hw3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Mikey");
        words.add("Nike");
        words.add("Puma");
        words.add("bike");
        System.out.println(words);
        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.endsWith("e")) {
                iterator.remove();

            }
        }
        System.out.println(words);
    }
}