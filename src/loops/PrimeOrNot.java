package loops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;   // counts total factors of num

        System.out.print("Enter a number : ");
        num = input.nextInt();

        // count how many factors num has
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // a number is prime only if it has exactly 2 factors (1 and itself)
        System.out.println((count == 2) ? "It is a prime number" : "It is not a prime number");

        input.close();
    }
}