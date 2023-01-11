package homework2three;
import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card with us?");
        String card=input.next();
        if(card.equals("No")){
            System.out.println("Would you like to apply?");
        }else{
            System.out.println("What is your current balance");
        }
        int balance=input.nextInt();
        if(balance>1000){
            System.out.println("Pay off the balance immidiatly");
        }else{
            System.out.println("You can spend more");
        }

    }
}
