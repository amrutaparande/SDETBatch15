package class8;

import java.sql.SQLOutput;

public class BreakDemo2 {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;
        while(summer){
            if(temp<=100){
                System.out.println("I Love Summer because Temperature is "+temp);
            }else{
                System.out.println("Its very hot");
                break;
            }
            temp+=5;
        }
    }
}
