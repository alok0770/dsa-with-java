package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int factorial = 1;   // start with 1, since we're multiplying (0 would make everything 0)

        // take number from user
        System.out.print("Enter a number : ");
        num = input.nextInt();

        System.out.println("-------------------------");

        // multiply factorial by every number from 1 to num
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " = " + factorial);
        System.out.println("-------------------------");

        input.close();
    }
}