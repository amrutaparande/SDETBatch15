package class3;

public class IfElse3 {
    public static void main(String[]args){
       /* boolean isTrue=false;
        if(isTrue!=false){
            System.out.println(isTrue);
        }*/
        char c='M';
        if(c=='M'){
            System.out.println("Male");
        }
        // with non premitive data types we cant use ==
        String name="Nate";
        if(name.equals("Sam")){
            System.out.println("Student");
        }
        if(!name.equals("Sam")){
            System.out.println("Not a student");
        }
    }
}
