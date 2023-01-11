package class4;

public class NestedIfDemo4 {
    public static void main(String[]args){
        boolean studyHard=true;
        int salary=90000;

        if(studyHard){
            System.out.println("We got the job");
            if(salary>100000){
                System.out.println("Lets buy tesla");
            }else{
                System.out.println("LEts buy toyota");
            }
        }else{
            System.out.println("It might take longer");
        }
    }
}
