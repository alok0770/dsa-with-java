package conditionals;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int day;
        String dayName = "" ;

        // keep asking until user enters 0 to exit
        while (true) {

            System.out.println();
            System.out.print("Enter A Number of Day (1-7, or 0 to exit) -> ");
            day = input.nextInt();

            System.out.println("------------------------");

            // exit condition
            if (day == 0) {
                System.out.println("Exiting program...");
                break;
            }
            // check which day the number corresponds to
            else if (day == 1) {
                dayName = "-> Today is Monday" ;

            } else if (day == 2) {
                dayName = "-> Today is Tuesday" ;

            } else if (day == 3) {
                dayName = "-> Today is Wednesday" ;

            } else if (day == 4) {
                dayName = "-> Today is Thursday" ;

            } else if (day == 5) {
               dayName = "-> Today is Friday";

            } else if (day == 6) {
               dayName = "-> Today is Saturday";

            } else if (day == 7) {
               dayName = "-> Today is Sunday" ;

            }
            // handle invalid input (anything outside 0-7)
            else {
                dayName = "Enter A valid Number Of day" ;
            }
            System.out.println(dayName);

            System.out.println("------------------------");
        }
    }
}