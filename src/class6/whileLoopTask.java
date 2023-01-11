package class6;

public class whileLoopTask {
    public static void main(String[] args) {
        int number=1;
        System.out.println("numbers 1-100");
        while(number<=100){
            System.out.println(number);
            number++;
        }
        System.out.println("Odd numbers 1-15");
        while(number<=15){
            System.out.println(number);
            number+=2;
        }
        number=5;
        System.out.println("increaments of 5");
        while(number<=50){
            System.out.println(number);
            number+=5;
        }
    }
}
