package arrays;

public class FindLargestElement {

    public static void main(String[] args) {

        int[] numbers = {23, 87, 12, 45, 99, 34, 76};

        // Assume the first element is the largest element
        int max = numbers[0];

        // Traverse the array and compare each element with max
        for (int i = 1; i < numbers.length; i++) {

            // Update max if the current element is greater
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the largest element
        System.out.println("==============================");
        System.out.println("      ARRAY RESULT");
        System.out.println("==============================");
        System.out.println("Largest Element : " + max);
        System.out.println("==============================");
    }
}