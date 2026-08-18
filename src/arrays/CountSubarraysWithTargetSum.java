package arrays;

public class CountSubarraysWithTargetSum {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int target = 30;
        int sum = 0;
        int count = 0;

        // Select the starting index of the subarray
        for (int i = 0; i < numbers.length; i++) {

            sum = 0;

            // Generate subarrays starting from index i
            for (int j = i; j < numbers.length; j++) {

                sum += numbers[j];

                // Check if the current subarray sum equals the target
                if (sum == target) {
                    count++;
                }
            }
        }

        // Display the total number of matching subarrays
        System.out.println("Count of subarrays with sum " + target + " : " + count);
    }
}