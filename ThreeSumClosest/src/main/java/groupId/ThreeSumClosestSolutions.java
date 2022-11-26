package groupId;

import java.util.ArrayList;

public class ThreeSumClosestSolutions {
    public int threeSumClosest(int[] nums, int target) {
        Integer x = checkConditions(nums, target);
        if (x != null) {
            return x;
        }
        ArrayList<Integer> numsList = getListNums(nums);
        if (numsList == null) {
            return 0;
        }
        int firstClosesValue = numsList.get(0) + numsList.get(1) + numsList.get(2);
        int differenceValue = Math.abs(target - firstClosesValue);
        int tempSumValue;
        int tempDifferenceValue;
        int lastClosesValue = firstClosesValue;
        while (numsList.size() > 2) {
            for (int i = 1; i < numsList.size() - 1; i++) {
                for (int j = i + 1; j < numsList.size(); j++) {
                    if (i != j) {
                        tempSumValue = numsList.get(0) + numsList.get(i) + numsList.get(j);
                        tempDifferenceValue = Math.abs(target - tempSumValue);
                        if (differenceValue > tempDifferenceValue) {
                            differenceValue = tempDifferenceValue;
                            lastClosesValue = tempSumValue;
                        }
                    }
                }
            }
            numsList.remove(0);
        }
        return lastClosesValue;
    }

    private static Integer checkConditions(int[] nums, int target) {
        if (nums.length < 3 || nums.length > 500 || target > Math.pow(10, 4) || target < -Math.pow(10, 4)) {
            return 0;
        }
        return null;
    }

    private static ArrayList<Integer> getListNums(int[] nums) {
        ArrayList<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            if (num > 1000 || num < -1000) {
                return null;
            }
            numsList.add(num);
        }
        return numsList;
    }
}
