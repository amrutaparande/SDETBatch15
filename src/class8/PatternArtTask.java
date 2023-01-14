package class8;

public class PatternArtTask {
    public static void main(String[] args) {
        /* 0 1 2 3 4 5
        1 2 3 4 5
        2 3 4 5
         */
       /* for(int i=0;i<3;i++){
            for(int j=0;j<=5;j++)
            {
                if(i==1&&j==0||i==2&&j==0||i==2&&j==1){
                    System.out.print("");
                    continue;

                }
                System.out.print(j+" ");
            }
            System.out.println();
        } */

        for (int i = 0; i < 5; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
