package class8;

public class NestedForTask {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            if(i==1&&i==4){
                continue;
            }
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
