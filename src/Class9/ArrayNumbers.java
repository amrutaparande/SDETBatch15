package Class9;

public class ArrayNumbers {
    public static void main(String[] args) {
        int sum=0;
        int numbers[]={10,20,30,45,50};
        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
            sum=sum+numbers[i];

        }
        System.out.println(sum);
    }
}
