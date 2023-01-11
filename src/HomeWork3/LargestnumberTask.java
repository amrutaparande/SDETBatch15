package HomeWork3;
import java.util.Scanner;
public class LargestnumberTask {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("and");
        int num3=input.nextInt();
       if(num1>num2 && num1>num3){
           System.out.println("First number "+num1+" is greater");
       }
        if(num2>num1 && num2>num3){
            System.out.println("Second number "+num2+" is greater");
        }
        if(num3>num1 && num3>num2){
            System.out.println("Third number "+num3+" is greater");
        }

    }
}
