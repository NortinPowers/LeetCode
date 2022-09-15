package twoSum;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums;
        int target;
        nums = new int[]{1,3,2,3};
        target = 6;
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        System.out.println(Arrays.toString(solutionTwoSum.twoSum(nums, target)));
    }

}

class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j< nums.length; j++) {
                System.out.println(i + " = " + nums[i] + "  " + j + " = " + nums[j]);
                System.out.println(nums[i] + nums[j]);
                if (i != j) {
                    if (target == nums[i] + nums[j]) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }
}