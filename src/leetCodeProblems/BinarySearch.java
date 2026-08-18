package leetCodeProblems;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Sorted array
        int[] numbers = {-1, 0, 3, 5, 9, 12};

        // Take target value from the user
        System.out.print("Enter target: ");
        int target = input.nextInt();

        // Start and end represent the current search range
        int start = 0;
        int end = numbers.length - 1;

        // Continue searching while the search range is valid
        while (start <= end) {

            // Find the middle index of the current search range
            int mid = (start + end) / 2;

            // Target found
            if (target == numbers[mid]) {

                System.out.println("Target found at index: " + mid);
                break;

                // Target is greater than the middle element,
                // so search in the right half
            } else if (target > numbers[mid]) {

                start = mid + 1;

                // Target is smaller than the middle element,
                // so search in the left half
            } else {

                end = mid - 1;
            }
        }

        // If start crosses end, the target does not exist in the array
        if (start > end) {
            System.out.println("Target not found. Index: -1");
        }

        input.close();
    }
}