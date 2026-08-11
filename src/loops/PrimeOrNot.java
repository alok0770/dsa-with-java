package loops;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {

            System.out.print("Enter a number: ");
            int num = input.nextInt();

            // Stop the program when the user enters 0
            if (num == 0) {
                isRunning = false;
            } else {

                // Reset the factor count for every new number
                int count = 0;

                // Count the total number of factors
                for (int i = 1; i <= num; i++) {

                    if (num % i == 0) {
                        count++;
                    }
                }

                // A prime number has exactly two factors: 1 and itself
                if (count == 2) {
                    System.out.println("It is a prime number");
                } else {
                    System.out.println("It is not a prime number");
                }

                System.out.println();
            }
        }

        input.close();
    }
}