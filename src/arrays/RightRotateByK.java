package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateByK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] animals = {"Lion", "Tiger", "Elephant", "Koala", "Bear"};

        int n = animals.length;

        // Display the original array
        System.out.println();
        System.out.println("==========================================");
        System.out.println("              ORIGINAL ARRAY");
        System.out.println("==========================================");
        System.out.println(Arrays.toString(animals));

        System.out.println();

        // Take the number of rotations from the user
        System.out.print("Enter number of right rotations: ");
        int k = input.nextInt();

        System.out.println();
        System.out.println("==========================================");
        System.out.println("       RIGHT ROTATION BY " + k + " POSITIONS");
        System.out.println("==========================================");

        // Repeat the right rotation k times
        for (int j = 1; j <= k; j++) {

            // Store the last element temporarily
            String animal = animals[n - 1];

            // Shift all elements one position to the right
            for (int i = n - 2; i >= 0; i--) {
                animals[i + 1] = animals[i];
            }

            // Place the last element at the first position
            animals[0] = animal;

            // Display the array after each rotation
            System.out.println("Rotation " + j + " : "
                    + Arrays.toString(animals));
        }

        System.out.println("==========================================");

        input.close();
    }
}