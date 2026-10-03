package sorting;

import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {

        int[] nums = {5, 4, 3, 2, 1};
        System.out.println("Unsorted Array : " + Arrays.toString(nums));


        sort(nums, 0 , nums.length-1);
        System.out.println("Sorted Array : " + Arrays.toString(nums));


    }

    public static void sort(int[] nums , int start, int end){

        if (start < end ){

            int mid = (start + end)/2;

            sort(nums , start , mid);
            sort(nums , mid+1 , end);

            merge(nums , start , mid , end);
        }

    }

    private static void merge(int[] nums, int start, int mid , int end) {

        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;

        int k = 0;

        while(i <= mid && j <= end){

            if(nums[i] < nums[j]){
                temp[k++] = nums[i++];
            }else {
                temp[k++] = nums[j++];
            }
        }

        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= end){
            temp[k++] = nums[j++];
        }

        for (int idx = 0; idx < temp.length ; idx++) {
            nums[idx + start] = temp[idx];

        }
    }
}
