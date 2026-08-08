package conditionals;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int day;

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
                System.out.println("-> Today is Monday");

            } else if (day == 2) {
                System.out.println("-> Today is Tuesday");

            } else if (day == 3) {
                System.out.println("-> Today is Wednesday");

            } else if (day == 4) {
                System.out.println("-> Today is Thursday");

            } else if (day == 5) {
                System.out.println("-> Today is Friday");

            } else if (day == 6) {
                System.out.println("-> Today is Saturday");

            } else if (day == 7) {
                System.out.println("-> Today is Sunday");

            }
            // handle invalid input (anything outside 0-7)
            else {
                System.out.println("Enter A valid Number Of day");
            }

            System.out.println("------------------------");
        }
    }
}