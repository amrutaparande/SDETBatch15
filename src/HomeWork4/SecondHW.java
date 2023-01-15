package HomeWork4;
import java.util.Scanner;
public class SecondHW {
    public static void main(String[] args) {
        /*2) Create a program
         that will be asking user to apply for a credit card 10 times.
          As soon you get an “yes” from a user program should stop asking.
         */
        Scanner scan = new Scanner(System.in);
            for (int i = 1; i <= 10; i++) {
                System.out.println("you want to apply for credit card?");
                boolean creditCard = scan.nextBoolean();
                if(creditCard)
                  break;
            }
        }
    }

