package conditionals;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;

        // take year from user
        System.out.print("Enter Any Year -> ");
        year = input.nextInt();

        // century years (like 1900, 2000) need a special check
        if (year % 100 == 0) {
            // century years are leap only if divisible by 400
            if (year % 400 == 0) {
                System.out.println(year + " : Is a leap year");
            } else {
                System.out.println(year + " : Is not a leap year");
            }
        } else {
            // non-century years are leap if divisible by 4
            if (year % 4 == 0) {
                System.out.println(year + " : Is a leap year");
            } else {
                System.out.println(year + " : Is not a leap year");
            }
        }

        input.close();
    }
}