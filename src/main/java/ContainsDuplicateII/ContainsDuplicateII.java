package ContainsDuplicateII;

import java.util.ArrayList;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        SolutionContainsDuplicateII solutionContainsDuplicateII = new SolutionContainsDuplicateII();
        int[] nums0 = {1, 2, 3, 1};
        int k0 = 3;
        System.out.println(solutionContainsDuplicateII.containsNearbyDuplicate(nums0, k0)); //true
        int[] nums1 = {1, 0, 1, 1};
        int k1 = 1;
        System.out.println(solutionContainsDuplicateII.containsNearbyDuplicate(nums1, k1)); //true
        int[] nums2 = {1, 2, 3, 1, 2, 3};
        int k2 = 2;
        System.out.println(solutionContainsDuplicateII.containsNearbyDuplicate(nums2, k2)); //false
    }
}

//Time limit exception
/*class SolutionContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         if (nums.length<1 || nums.length>Math.pow(10,5) || k<0 || k>Math.pow(10,5)){return false;}
         for (int i=0;i<nums.length-1;i++){
             if (nums[i]<Math.pow(-10,9)||nums[i]>Math.pow(10,9)){return false;}
             for (int j= i+1;j<nums.length;j++){
                 if (nums[j]<Math.pow(-10,9)||nums[j]>Math.pow(10,9)){return false;}
                // System.out.println("i="+i+" num[i]="+nums[i]+"  j="+j+" num[j]="+nums[j]);
                 if (nums[i]==nums[j]){
                    // System.out.println("I");
                     if (Math.abs(i-j)<=k){return true;}
                 }else {
                    // System.out.println("II");
                     continue;
                 }
             }
         }
        return false;
    }
}*/

//Time limit exception
class SolutionContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 1 || nums.length > Math.pow(10, 5) || k < 0 || k > Math.pow(10, 5)) {
            return false;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        boolean b = false;
        for (int i : nums) {
            if (i < Math.pow(-10, 9) || i > Math.pow(10, 9)) {
                return false;
            }
            if (integers.contains(i)) {
                b = true;
            }
            integers.add(i);
        }
        if (b) {
            int i;
            while (integers.size() > 1) {
                i = integers.get(0);
                integers.remove(0);
                if (integers.contains(i)) {
                    if (Math.abs(integers.indexOf(i) + 1) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}


