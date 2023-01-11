package homework2three;

import java.util.Scanner;
public class mortgageloan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is mortgage rate? ");
        float rate= input.nextFloat();
      //  System.out.println("What is the price of the house");
        if (rate>4.5){
            System.out.println("Client will not buy a house");
        } else {
            System.out.println("What is the price of the house");
            int price= input.nextInt();
            if(price>200000){
                System.out.println("Client will take a loan");
            }else {
                System.out.println("Client will pay cash");
            }

        }

        }
    }

