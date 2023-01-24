package Class12;

public class StringDemo6 {
    public static void main(String[] args) {
        String str="  Java  ";
        String str2="   Java  uy  ";
        //it removes spaces from start and end not from inbetween
        System.out.println(str.trim());
        System.out.println(str2.trim());
    }
}
