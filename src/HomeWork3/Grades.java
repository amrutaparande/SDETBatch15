package HomeWork3;
import java.util.Scanner;
public class Grades {
    /* ) Write a program that will read three
    inputs of scores (quiz, mid term, and final scores)
     and determine the grade based on the following rules:
    if the average score >=90 → grade=A
    if the average score >= 70 and <90 → grade=B
    if the average score>=50 and <70 → grade=C
    if the average score<50 → grade=F*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your quiz score");
        int quiz=scan.nextInt();
        System.out.println("Enter your Mid Term Score");
        int midTerm=scan.nextInt();
        System.out.println("Enter your final score");
        int finalScores= scan.nextInt();
        int avg=(quiz+midTerm+finalScores)/3;
        if (avg>=90){
            System.out.println("Grade A");
        } else if (avg>=70 && avg<90) {
            System.out.println("Grade B");
        } else if (avg>=50 && avg<70) {
            System.out.println("Grade C");
        } else if (avg<50) {
            System.out.println("Grade F");
        }
    }
}

