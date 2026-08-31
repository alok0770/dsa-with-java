package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] num = {2, 1, 6, 3, 5, 8, 4};

        // Display array before sorting
        System.out.println("==============================");
        System.out.println("          BUBBLE SORT");
        System.out.println("==============================");
        System.out.println("Before Sorting : " + Arrays.toString(num));

        // Perform Bubble Sort
        for (int i = 0; i < num.length - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < num.length - 1; j++) {

                // Swap if the current element is greater
                // than the next element
                if (num[j] > num[j + 1]) {

                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // Display array after sorting
        System.out.println("After Sorting  : " + Arrays.toString(num));
        System.out.println("==============================");
    }
}