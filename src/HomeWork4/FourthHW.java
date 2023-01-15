package HomeWork4;
import java.util.Scanner;
public class FourthHW {
    public static void main(String[] args) {
        /*
4) Write a program to ask a user to enter item they want
 to buy and the price of that item. Every time user enters
 money accumulate the amount and tell the user how much is left to pay off.
  If user give more money program should return a change. Whenever a user
  done with payments program should say "Thank you for shopping!"
         */float TotalPrice=0;
         float cashback=0;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter the item you want to buy");
            String name=scan.next();
            System.out.println("Enter the item price");
            float price= scan.nextFloat();
            TotalPrice=price+TotalPrice;
        }
        System.out.println("TOtal Bill = $"+TotalPrice);
        System.out.println("Select payment method :: CREDIT CARD \n DEBIT CARD \n CASH \n GIFT CARD");
        String PaymentMethod=scan.next();
        switch(PaymentMethod){
            case "CREDIT CARD":
                System.out.println("Insert your card");
                break;

            case "DEBIT CARD":
                System.out.println("Insert your card");
                System.out.println("Enter password");
                int pass= scan.nextInt();
                break;

            case "CASH":
                System.out.println("Enter total amount you paid");
                float paid=scan.nextFloat();
                cashback=paid-TotalPrice;
                System.out.println("you are getting $ "+cashback+" return" );
                break;

            case "GIFT CARD":
                System.out.println("Enter total amount in your GIFT CARD");
                float cardBalance=scan.nextFloat();
                cashback=cardBalance-TotalPrice;
                System.out.println("you are getting $ "+cashback+" return" );
                break;

        }
        System.out.println("Thank you for shopping");

    }
}
