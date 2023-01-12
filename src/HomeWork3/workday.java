package HomeWork3;

public class workday {
    public static void main(String[] args) {
        /*Create a boolean variable workDay and
        assign true create int variable day and
        assign it to 1 As long as it is workDay
        print “I need a day off” and increase day.
        Once day is 6 print “I do not need a day off
         any more”*/
        boolean workday = true;
        int day = 1;
        while (workday) {
            System.out.println("I need a day off");
            if (day == 5) {
                workday = false  ;
                System.out.println("I do not need a day off");

            }
            day++;
        }


    }
}
