package HomeWorkArrayList;
import java.util.ArrayList;
public class ArrayListHW {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jimmy");
        names.add("Jittu");
        names.add("Jignesh");
        names.add("Jayesh");
        System.out.println("Is ArrayList empty?");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jignesh"));
        System.out.println( names.contains("Jaya"));
        System.out.println(names.size());
        System.out.println(names);



    }
}