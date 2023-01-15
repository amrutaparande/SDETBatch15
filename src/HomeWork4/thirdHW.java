package HomeWork4;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class thirdHW {
    public static void main(String[] args) {
    /*  Write a program that reads a range of
integers (start and end point), provided by a user
and then from that range prints the sum of the even and odd integers.*/
    int evensum=0,oddsum=0;
        Scanner scan=new Scanner(System.in);
    System.out.println("Enter First number in the range");
    int a=scan.nextInt();
    System.out.println("Enter Last number in the range");
    int b=scan.nextInt();
    for(int i=a;i<=b;i++){
        if(i%2==0){
            evensum=i+evensum;
        } else if (i%3==0) {
            oddsum=i+oddsum;
        }
    }
        System.out.println("Sum of even numbers from the given range: "+evensum);
        System.out.println("Sum of Odd numbers from the given range:"+oddsum);
    }
}
