package HomeWork3;

import java.util.Scanner;

public class doubleLargeNumber {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        System.out.println("and");
        double num3=input.nextDouble();
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
