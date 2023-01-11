package homework2three;
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hoe long You are employed?");
        byte years=input.nextByte();
        if(years>=5){
            System.out.println("You are eligible for bonus");
        }else{
            System.out.println("You are not eligible for bonus");
        }
        System.out.println("what is the annual salary?");
        int salary=input.nextInt();
        if(salary>50000){
            System.out.println("Your bonus is $5000");
        }else{
            System.out.println("your bonus is $3000");
        }

    }
}
