package conditionals;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        // take number from user
        System.out.print("Enter A Number : ");
        number = input.nextInt();

        // check remainder when divided by 2
        // works correctly for negative numbers too, since we use else (not else-if with ==1)
        if (number % 2 == 0) {
            System.out.println("Number " + number + " Is Even Number");
        } else {
            System.out.println("Number " + number + " Is Odd Number");
        }

        input.close();
    }
}