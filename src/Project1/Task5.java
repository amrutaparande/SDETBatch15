package Project1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop
        // a program which will calculate the sum of  even and odd numbers for that array.
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[3][2];
        int even=0,odd=0;
        System.out.println("Enter 3*2 array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = scan.nextInt();
                if(arr[i][j]%2==0){
                    even=even+arr[i][j];
                } else if (arr[i][j]%2 != 0) {
                    odd=odd+arr[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers from array : "+even+"\n Sum of Odd numbers from array : "+odd);

    }
}
