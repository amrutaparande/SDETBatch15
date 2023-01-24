package Project1;

public class Task11 {
    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings?
        String arr[] = {"abc", "cbd", "dce", "efg", "cbd", "hij", "efg"};
        for (int i = 0; i < arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(i+"::"+arr[i]);
                }
            }
        }
    }
}
