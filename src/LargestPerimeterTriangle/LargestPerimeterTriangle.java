package LargestPerimeterTriangle;

import java.util.ArrayList;
import java.util.Collections;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        SolutionLargestPerimeterTriangle solutionLargestPerimeterTriangle = new SolutionLargestPerimeterTriangle();

        int[] i1 = {3,6,2,3};
        System.out.println(solutionLargestPerimeterTriangle.largestPerimeter(i1));
        int[] i2 = {1,2,1};
        System.out.println(solutionLargestPerimeterTriangle.largestPerimeter(i2));

    }
}

class SolutionLargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        if (nums.length<3 || nums.length>Math.pow(10,4)){return 0;}
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            if (nums[i]<1 || nums[i]>Math.pow(10,6)){return 0;}
            ints.add(nums[i]);
        }
        Collections.sort(ints);
        System.out.println("sort "+ ints);
        for (int i = 0; i<ints.size()-2;i++){
            if (ints.get(ints.size()-1)+ints.get(ints.size()-2)>ints.get(ints.size()-3-i) &&
                    ints.get(ints.size()-1)+ints.get(ints.size()-3-i)>ints.get(ints.size()-2) &&
                    ints.get(ints.size()-3-i)+ints.get(ints.size()-2)>ints.get(ints.size()-1)){
                System.out.println(ints.get(ints.size()-1)+" "+ints.get(ints.size()-2)+" "+ints.get(ints.size()-3-i));
                return ints.get(ints.size()-1)+ints.get(ints.size()-2)+ints.get(ints.size()-3-i);
            } else {
                i=-1;
                ints.remove(ints.size()-1);
            }
        }
        return 0;
    }
}