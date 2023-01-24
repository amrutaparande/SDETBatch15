package Class12;

public class StringDemo {
    public static void main(String[] args) {
        //Creating object of string class
        //String strObj=new String("Java");
        //another way of creating an object --Mostly used
        String strObj="Java";
        System.out.println(strObj.length());
        String str="BANANA";
        int len=str.length();
        System.out.println(len);
        String name="Hamid poya ";
        if(name.length()>10){
            System.out.println("please enter name with 10 letters only");
        }

    }
}
