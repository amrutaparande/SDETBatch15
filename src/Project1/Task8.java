package Project1;

public class Task8 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.
      int n1=0,n2=1,n3=0;
      int count=10;
      do{
          n3=n1+n2;
          n1=n2;
          n2=n3;
          System.out.println(" "+n3);
          count--;

      }while(count>0);

    }
}
