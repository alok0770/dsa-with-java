package loops;

public class BreakContinueDemo {

    public static void main(String[] args) {

        /*
         * Question:
         * Print numbers from 1 to 30 with the following rules:
         *
         * 1. If a number is divisible by 15, terminate the loop immediately. (break)
         * 2. If a number is divisible by 3 but not by 15, skip that number. (continue)
         * 3. Print all the remaining numbers.
         */

        for (int i = 1; i <= 30; i++) {

            // Terminate the loop when a number divisible by 15 is found.
            if (i % 15 == 0) {
                break;
            }

            // Skip numbers that are divisible by 3.
            if (i % 3 == 0) {
                continue;
            }

            // Print all remaining numbers.
            System.out.println(i);
        }

        /*
         * Output:
         *
         * 1
         * 2
         * 4
         * 5
         * 7
         * 8
         * 10
         * 11
         * 13
         * 14
         */
    }
}