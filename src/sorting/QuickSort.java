package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] nums = {7, 5, 4, 1, 8, 0};
        System.out.println("Unsorted Array : " + Arrays.toString(nums));

        quickSort(nums , 0, nums.length-1);
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }

    public static void quickSort(int [] nums , int start , int end){

        if(start < end )

        {
            int pivot = partition(nums , start, end);

            quickSort(nums , start , pivot-1);
            quickSort(nums , pivot+1 , end);
        }


    }

    public static int partition(int [] nums , int start, int end){

        int pivot = nums[end];
        int i = start - 1;

        for (int j = start; j < end ; j++) {

            if(nums[j] < pivot){
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[end];
        nums[end] = temp;

        return i+1;
    }
}
