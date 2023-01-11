package homework2three;
import java.util.Scanner;
public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temp=input.nextInt();
        if(temp<32){
            System.out.println("Water will freez ");
        }else
            System.out.println("Water will not freez");

    }
}
