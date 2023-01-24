package Class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I Love Java";
        String str2="Like It";
        boolean startswith=str.startsWith("I");
        System.out.println(startswith);
        boolean startwith1=str2.startsWith("I");
        System.out.println(startwith1);

        System.out.println(str.endsWith("Java"));

        //Method chaining is when multiple methods are called on the same line
        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println(str.contains("java"));

    }
}
