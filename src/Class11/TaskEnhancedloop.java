package Class11;

public class TaskEnhancedloop {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30}, {45, 55, 65}, {30, 40, 20, 10, 25}};
        //write a enhamced loop to print all the elements from 2D array

        for (int [] arr: matrix) {
            for (int number:arr){
            System.out.print(number+" ");
            }System.out.println();
        }

    }
}
