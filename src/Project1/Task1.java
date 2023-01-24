package Project1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //Using Scanner create an array of integer values.
        // After the array is created, calculate the sum of all stored elements in that array.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter total numbers in array");
        int n=scan.nextInt();
       int sum=0;
        int arr[]=new int[n];
        System.out.println("Please enter numbers in array");
        for(int i=0;i<arr.length;i++){
            arr[i]= scan.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of array is : "+sum);

    }
}
