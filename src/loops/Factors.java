package loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;   // counts total factors, starts at 0

        System.out.print("Enter a number : ");
        num = input.nextInt();

        System.out.println("-------------------------");

        // check every number from 1 to num, print if it's a factor and count it
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("-------------------------");
        System.out.println("Total factors : " + count);
        System.out.println("-------------------------");

        input.close();
    }
}