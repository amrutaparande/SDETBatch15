package HomeWork3;

public class OddNumbers {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        int num=20;
        while(num<=50){
            if(num%2!=0)
            System.out.println(num);
            num++;
        }
        int  number=20;
        while(number<=50)
        {
            if(number%2!=0){
                System.out.println("Odd"+number);
            }
            number++;
        }
    }
}
