package leetCodeProblems;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        // Input array
        int[] numbers = {0, 1, 0, 3, 12};

        // Store the length of the array
        int n = numbers.length;

        // Display the original array
        System.out.println("Original Array : " + Arrays.toString(numbers));

        /*
         * j points to the next position where a non-zero element
         * should be placed.
         */
        int j = 0;

        // Traverse the complete array using i
        for (int i = 0; i < n; i++) {

            // Check if the current element is non-zero
            if (numbers[i] != 0) {

                /*
                 * Swap the current non-zero element with the element
                 * at position j.
                 */
                int temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;

                // Move j to the next position
                j++;
            }
        }

        // Display the array after moving all zeros to the end
        System.out.println("After Moving Zeros : " + Arrays.toString(numbers));
    }
}