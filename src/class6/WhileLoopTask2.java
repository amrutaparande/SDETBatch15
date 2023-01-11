package class6;

public class WhileLoopTask2 {
    //print below sequence 1 2 3 4 6 7 8 9 11 12 13 14
    public static void main(String[] args) {
        int num=1;
        while(num<15)
        {
            if(num%5==0){
                num++;}

        System.out.println(num);
        num++;}
    }
}
