package HomeWork3;

import java.util.Scanner;

public class CountryLang {
    public static void main(String[] args) {
       /* 7) Ask user to enter their country and capture
       it. Once values are captured print which language user speaks.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your country");
        String country = input.next();
        switch (country) {
            case "Usa":
            case "usa":
                System.out.println("YOu have selected English");
                break;

            case "India":
            case "india":
                System.out.println("you have selected Hindi");
                break;

            case "China":
            case "china":
                System.out.println("You have selected chinese");
                break;

            case "France":
            case "france":
                System.out.println("you have selected French");
                break;

            default:
                System.out.println("You have entered wrong country");


        }

    }
}
