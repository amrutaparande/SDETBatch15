package HomeWork3;

public class EvenNumbers {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        int num=0;
        while(num<=20){
            System.out.println(num);
            num+=2;
        }
       int  number=0;
        while(number<=20)
        {
            if(number%2==0){
                System.out.println("Even"+number);
            }
            number++;
        }
    }
}
