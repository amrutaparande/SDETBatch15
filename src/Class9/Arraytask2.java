package Class9;

public class Arraytask2 {
    public static void main(String[] args) {
        //add all even indexes and print
        int evensum=0;
        int[] numbers=new int[8];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=6;
        numbers[6]=7;
        numbers[7]=80;
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
            if(numbers[i]%2==0){
                evensum=evensum+numbers[i];
            }
        }
        System.out.println("evensum"+evensum);
    }
}
