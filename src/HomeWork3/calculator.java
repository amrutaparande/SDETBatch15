package HomeWork3;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        /* 8)HomeWork: Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user. */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int number1= input.nextInt();
        int number2= input.nextInt();
        System.out.println("Please enter operator");
        char operator=input.next().charAt(0);
        double result;
        switch(operator){
            case '+':
                result=number1+number2;
                System.out.println("Result is"+result);
                break;
            case '-':
                result=number1-number2;
                System.out.println("Result is"+result);
                break;
            case '*':
                result=number1*number2;
                System.out.println("Result is"+result);
                break;
            case '/':
                result=number1/number2;
                System.out.println("Result is"+result);
                break;
            case'%':
                result=number1%number2;
                System.out.println("Result is"+result);
            default:
                System.out.println("Wrong operator");

        }

    }
}
