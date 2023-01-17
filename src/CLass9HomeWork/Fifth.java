package CLass9HomeWork;

public class Fifth {
    public static void main(String[] args) {
        /*Create an array of size 5 on
        integers and calculate the sum of all elements in an array.
         */
        int sumAll=0;
        int [] sum=new int[6];
        sum[0]=52;
        sum[1]=64;
        sum[2]=87;
        sum[3]=109;
        sum[4]=2098;
        for(int i=0;i< sum.length;i++){

            sumAll=sumAll+sum[i];
        }
        System.out.println(sumAll);
    }
}
