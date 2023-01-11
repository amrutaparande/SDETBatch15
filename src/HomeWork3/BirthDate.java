package HomeWork;

import java.util.Scanner;
public class BirthDate {
    public static void main(String[] args) {
        /* 4)Write a program for user to enter his/hers birth month.
        Based on the month define the season.
        Example: if user is born in
        June, July or August → season =”Summer”.
        At the end of the program we should
        see output as “You were born __”. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month= scan.next();
        if(month.equals("june")||month.equals("july")||month.equals("august")){
            System.out.println("Summer");
        } else if(month.equals("sept")||month.equals("oct")||month.equals("nov")){
            System.out.println("Fall");
        }else if(month.equals("dec")||month.equals("jan")||month.equals("feb")){
            System.out.println("winter");
        }else if(month.equals("march")||month.equals("april")||month.equals("may")){
            System.out.println("Spring");
        }else {
            System.out.println("Wrong month");
        }

        }


    }

