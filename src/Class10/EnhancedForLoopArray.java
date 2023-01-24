package Class10;

public class EnhancedForLoopArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
//******************************************************
        System.out.println("------Enhanched for loop-------------------");
        for(int number:arr){
            System.out.println(number);
        }

    }
}
