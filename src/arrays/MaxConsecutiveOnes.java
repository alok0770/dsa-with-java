package arrays;

public class MaxConsecutiveOnes {
    static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1};

        System.out.println("Max Count : " + find(nums));
    }

    public static int find (int [] nums){

        int count = 0;
        int max = 0;

        int n = nums.length;

        for (int i = 0; i < n ; i++) {

            if(nums[i] == 1){
                count++;

                if(count > max ){
                    max = count ;
                }
            }else{
                count = 0;
            }
        }
        return max;
    }
}