package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take the size of the array from the user
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Take array elements as input
        System.out.println("\nEnter array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Display the original array
        System.out.println("\n-----------------------------");
        System.out.println("Original Array");
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(arr));

        // Initialize two pointers
        int start = 0;
        int end = arr.length - 1;

        // Reverse the array using two-pointer approach
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Display the reversed array
        System.out.println("\n-----------------------------");
        System.out.println("Reversed Array");
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(arr));

        input.close();
    }
}