package class5;

public class LogicalOperators {
    public static void main(String[] args) {
       /* System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);
        int number=1;
        if(number !=1)
        {
            System.out.println("Hello Java");
        }else{
            System.out.println("Hello world");
        }
        String country="China";
        if(!country.equals("BadCountry")){
            System.out.println("you are welcome");
        }*/


        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);
        boolean choco=true;
        boolean flowers=true;
        if(choco||flowers)
        {
            System.out.println("Happy");
        }else{
            System.out.println("Sad");
        }
    }
}
