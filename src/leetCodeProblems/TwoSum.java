package leetCodeProblems;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 11;
        int n = nums.length;
        boolean found = false;

        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {

                if(nums[i] + nums[j] == target){
                    System.out.println("Indexes: [" + i + ", " + j + "]");

                    found = true;
                }
            }
        }

        if (!found){
            System.out.println("Not any valid indexes : -1 ");
        }

    }
}
