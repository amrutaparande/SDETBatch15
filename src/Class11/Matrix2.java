package Class11;

public class Matrix2 {
    public static void main(String[] args) {
        int[][] matrix={{10,20,30},{45,55,65},{30,40,20,10,25}};
         //write a loop to print all the elements from 2D array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
