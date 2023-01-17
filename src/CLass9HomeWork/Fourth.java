package CLass9HomeWork;

public class Fourth {
    public static void main(String[] args) {
         /* Create an array that can store names
         of cars and store 6 elements into it. Print all
         values from the array.
          */
        String [] cars=new String[6];
        cars [0]="BMW";
        cars [1]="Audi";
        cars [2]="Toyota";
        cars [3]="Honda";
        cars [4]="Tesla";
        cars [5]="Kia";
        for(int i=0;i< cars.length;i++) {
            System.out.println(cars[i]);
        }
    }
}
