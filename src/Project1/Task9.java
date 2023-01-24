package Project1;

public class Task9 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
       // int arr[]={9,5,3,6,3,7,4,2,};
        int arr[]={44,66,99,77,33,22,55};
        int max=0;
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum number in array is"+max);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    min=arr[i];
                } else if (arr[j]<arr[i]) {
                    min=arr[j];

                }
            }

        }
        System.out.println("Minimum number in array is "+min);

    }
}
