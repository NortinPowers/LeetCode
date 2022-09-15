package MedianOfTwoSortedArrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        SolutionMedianOfTwoSortedArrays solutionMedianOfTwoSortedArrays = new SolutionMedianOfTwoSortedArrays();
        System.out.println("Median value: " + solutionMedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}

class SolutionMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        //combined arrays
        //add constrains
        if (0<=nums1.length & nums1.length<=1000 & 0<=nums2.length & nums2.length<=1000) {
            double[] combinedIntArrays = new double[nums1.length + nums2.length];
            if (1<=combinedIntArrays.length) {
                int count = 0;
                for (int i = 0; i < nums1.length; i++) {
                    if(-1000000 > nums1[i]) {
                        return result;
                    }
                    combinedIntArrays[i] = nums1[i];
                    count++;
                }
                for (int j = 0; j < nums2.length; j++) {
                    if(nums2[j]>1000000) {
                        return result;}
                    combinedIntArrays[count + j] = nums2[j];
                }
                //test - combined arrays
                //System.out.println("combined: " + Arrays.toString(combinedIntArrays));
                Arrays.sort(combinedIntArrays);
                //test sort
                //System.out.println("sort: "+ Arrays.toString(combinedIntArrays));
                if ((combinedIntArrays.length - 1) % 2 == 0) {
                    result = combinedIntArrays[(combinedIntArrays.length - 1) / 2];
                   // System.out.println("-1-");
                } else {
                    result = (combinedIntArrays[(combinedIntArrays.length) / 2 - 1] + combinedIntArrays[(combinedIntArrays.length) / 2]) / 2;
                   // System.out.println("-2-");
                }
            }
        }
        return result;
    }
}