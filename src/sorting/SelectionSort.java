package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] num = {5, 1, 3, 2, 4};

        System.out.println("==============================");
        System.out.println("        SELECTION SORT");
        System.out.println("==============================");
        System.out.println("Before Sorting : " + Arrays.toString(num));

        selectionSort(num);

        System.out.println("After Sorting  : " + Arrays.toString(num));
        System.out.println("==============================");
    }

    public static void selectionSort(int[] num) {

        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            if (minIndex != i) {
                int temp = num[i];
                num[i] = num[minIndex];
                num[minIndex] = temp;
            }
        }
    }
}