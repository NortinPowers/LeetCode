package twoSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums;
        int target;
        nums= new int[]{1,1,1,2,3,4};
        target = 8;
        SolutionTwoSum solutionTwoSum =  new SolutionTwoSum();
        System.out.println(Arrays.toString(solutionTwoSum.twoSum(nums,target)));
    }

}
class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i<nums.length; i++){
            for (int j=1; j<nums.length-1; j++){
               // System.out.println(i+" = "+nums[i]+"  "+j+" = "+nums[j]);
                    if (target == nums[i] + nums[j]) {
                        result[0] = nums[i];
                        result[1] = nums[j];
                        break;
                    }
            }
        }
        return result;
    }
}