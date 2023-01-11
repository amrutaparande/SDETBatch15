package class5;


import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /* */

        System.out.println("please enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+"years old");
        System.out.println("enter your weight87" +
                "");
        double weight=scan.nextDouble();
        System.out.println("your weight is"+weight);
        System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry"+hungry);
        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("your gender is"+gender);
        System.out.println("please enter your name");
        String name=scan.next();
        System.out.println("your name is"+name);
        scan.nextLine();
        System.out.println("please enter your fullname");
        String fullname=scan.nextLine();
        System.out.println("your name is"+fullname);


    }
}
