package loops;

public class NestedLoops {

    public static void main(String[] args) {

        int n = 5;

        // 1. Square Star Pattern
        System.out.println("1. Square Star Pattern");

        for (int i = 1; i <= n; i++) {

            // Inner loop prints stars for each column
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }

            // Move to the next row
            System.out.println();
        }

        System.out.println();

        // 2. Increasing Triangle Pattern
        System.out.println("2. Increasing Triangle Pattern");

        for (int i = 1; i <= n; i++) {

            // Number of stars increases with each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        System.out.println();

        // 3. Decreasing Triangle Pattern
        System.out.println("3. Decreasing Triangle Pattern");

        for (int i = n; i >= 1; i--) {

            // Number of stars decreases with each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        System.out.println();

        // 4. Mirror Right Angle Triangle
        System.out.println("4. Mirror Right Angle Triangle");

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Inner loop prints stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // 5. Star V Pattern
        System.out.println("5. Star V Pattern");

        for (int i = 1; i <= n; i++) {

            // Loop controls the columns of the pattern
            for (int j = 1; j < 2 * n; j++) {

                // Print a star when the position matches either diagonal
                if ((i == j) || (i + j == 2 * n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}