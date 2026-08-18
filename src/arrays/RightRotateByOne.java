package arrays;

import java.util.Arrays;

public class RightRotateByOne {

    public static void main(String[] args) {

        String[] names = {"Alok", "Sumit", "Shivaya", "Rohan", "Aman"};

        int n = names.length;

        // Display the original array
        System.out.println("========================================");
        System.out.println("           ORIGINAL ARRAY");
        System.out.println("========================================");
        System.out.println(Arrays.toString(names));

        // Store the last element temporarily
        String name = names[n - 1];

        // Shift all elements one position to the right
        for (int i = n - 2; i >= 0; i--) {
            names[i + 1] = names[i];
        }

        // Place the last element at the first position
        names[0] = name;

        // Display the array after right rotation
        System.out.println();
        System.out.println("========================================");
        System.out.println("       AFTER RIGHT ROTATE BY 1");
        System.out.println("========================================");
        System.out.println(Arrays.toString(names));
        System.out.println("========================================");
    }
}