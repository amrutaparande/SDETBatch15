package Project1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable?
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers to swap");
        int x= scan.nextInt();
        System.out.println("X="+x);
        int y=scan.nextInt();
        System.out.println("y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swaping \nx= "+x+"\ny= "+y);


    }
}
