package Project1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=scan.nextInt();
        boolean flag = false;
        for (int i = 2; i <= x / 2; ++i) {
            // condition for nonprime number
            if (x % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(x + " is a prime number.");
        else
            System.out.println(x + " is not a prime number.");
    }

    }

