package arrays;

public class FindSecondLargestElement {

    public static void main(String[] args) {

        int[] numbers = {23, 87, 12, 45, 99, 34, 76};

        // Initialize max and second maximum with the smallest integer value
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest elements
        for (int i = 0; i < numbers.length; i++) {

            // If the current element is greater than max,
            // update second maximum first and then update maximum
            if (numbers[i] > max) {
                secMax = max;
                max = numbers[i];

                // If the current element is not the maximum
                // but is greater than the second maximum, update secMax
            } else if (numbers[i] > secMax) {
                secMax = numbers[i];
            }
        }

        // Display the second largest element
        System.out.println("================================");
        System.out.println("       ARRAY RESULT");
        System.out.println("================================");
        System.out.println("Largest Element        : " + max);
        System.out.println("Second Largest Element : " + secMax);
        System.out.println("================================");
    }
}