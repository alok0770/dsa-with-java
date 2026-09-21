package sorting;

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {

        int [] nums = {5, 7, 9, 1, 3, 6};
        System.out.println("Unsorted Array : " + Arrays.toString(nums));
        Selection(nums);
    }

    public static void Selection(int [] nums){

        int n = nums.length;

        for (int i = 1; i < n ; i++) {

            int key = nums[i];
            int prev = i-1;

            while(prev >= 0 && nums[prev] > key){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = key;
        }
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}
