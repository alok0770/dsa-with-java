package arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {

        int[] nums = {4,1,2,6,10,5,9};
        checkSorted(nums);

    }

    public static void checkSorted(int[] nums) {

        int n = nums.length;
        boolean isSorted = true;

        for (int i = 0; i < n-1 ; i++) {

            if(nums[i] > nums[i+1]){
                isSorted = false;
                break;
            }
        }


        if(isSorted){
            System.out.println("Array is sorted !! ");
        }else{
            System.out.println("Array is not sorted !!");
        }
    }
}