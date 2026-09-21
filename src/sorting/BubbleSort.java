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
        for (int i = 0; i < num.length; i++) {

            boolean isSwapped = false;

            // Compare adjacent elements
            for (int j = 0; j < num.length - 1 - i; j++) {


                if (num[j] > num[j + 1]) {

                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                    isSwapped = true;
                }
            }


            // If no swapping occurred, array is already sorted
            if (!isSwapped) {
                break;
            }
        }

            // Display array after sorting
            System.out.println("After Sorting  : " + Arrays.toString(num));
            System.out.println("==============================");
        }
    }

