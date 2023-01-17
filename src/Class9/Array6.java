package Class9;

public class Array6 {
    public static void main(String[] args) {
        //add all even indexes and print
        int evensum=0;
        int[] numbers=new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
            if(i%2==0){
                evensum=evensum+numbers[i];
            }
        }
        System.out.println("evensum"+evensum);
    }
}
