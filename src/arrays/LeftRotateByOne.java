package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take the size of the array from the user
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        // Take array elements as input
        System.out.println("\nEnter array elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Display the original array
        System.out.println("\n-----------------------------");
        System.out.println("Original Array");
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(numbers));

        // Store the first element temporarily
        int temp = numbers[0];
        int n = numbers.length;

        // Shift all elements one position to the left
        for (int i = 1; i < n; i++) {
            numbers[i - 1] = numbers[i];
        }

        // Place the first element at the last position
        numbers[n - 1] = temp;

        // Display the left-rotated array
        System.out.println("\n-----------------------------");
        System.out.println("Left Rotated Array");
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(numbers));

        input.close();
    }
}