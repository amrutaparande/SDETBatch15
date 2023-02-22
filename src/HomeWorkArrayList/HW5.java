package HomeWorkArrayList;

import java.util.ArrayList;

/*5)Create an arrayList of even numbers from 1 to 500.
Remove any number that is divisible by 5 from that arrayList.*/
public class HW5 {
    public static void main(String[] args) {
        ArrayList<Integer> even =new ArrayList<>();
        for(int i=0;i<500;i++) {
            if(i%2==0) {
                even.add(i);
            }
        }
        for(int i=0;i<even.size();i++){
            if(even.get(i)%5==0){
                even.remove(i);
            }
        }
        System.out.println(even);
    }
}
