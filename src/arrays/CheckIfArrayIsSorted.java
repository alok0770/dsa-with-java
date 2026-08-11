package arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 3, 40, 50};

        // Assume the array is sorted initially
        boolean isSorted = true;

        // Compare each element with the next element
        for (int i = 0; i < numbers.length - 1; i++) {

            // If the current element is greater than the next element,
            // the array is not sorted
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Display the result
        System.out.println("================================");
        System.out.println("       ARRAY SORT CHECK");
        System.out.println("================================");

        if (!isSorted) {
            System.out.println("Result : Array is NOT sorted.");
        } else {
            System.out.println("Result : Array is sorted.");
        }

        System.out.println("================================");
    }
}