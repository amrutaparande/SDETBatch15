package class8;
import java.util.Scanner;
public class LoopWthString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(scanner.next().equalsIgnoreCase("Sha")){
            System.out.println("Great student");
        }
    }
}
