package ContainerWithMostWater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainerWithMostWater {
    public static void main(String[] args) {
//        time
        long start = System.currentTimeMillis();
        SolutionContainerWithMostWater solutionContainerWithMostWater = new SolutionContainerWithMostWater();
        System.out.println("------------");
        int[] i1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solutionContainerWithMostWater.maxArea(i1)); //49
        System.out.println("------------");
        int[] i2 = {1, 1};
        System.out.println(solutionContainerWithMostWater.maxArea(i2)); //1
        System.out.println("------------");
        int[] test = {159, 157, 139, 51, 98, 71, 4, 125, 48, 125, 64, 4, 105, 79, 136, 169, 113, 13, 95, 88, 190, 5, 148, 17, 152, 20, 196, 141,
                35, 42, 188, 147, 199, 127, 198, 49, 150, 154, 175, 199, 80, 191, 3, 137, 22, 92, 58, 87, 57, 153, 175, 199, 110, 75, 16, 62, 96,
                12, 3, 83, 55, 144, 30, 6, 23, 28, 56, 174, 183, 183, 173, 15, 126, 128, 104, 148, 172, 163, 35, 181, 68, 162, 181, 179, 37, 197,
                193, 85, 10, 197, 169, 17, 141, 199, 175, 164, 180, 183, 90, 115};
        System.out.println(solutionContainerWithMostWater.maxArea(test)); //15423
        System.out.println("------------");
        int[] test40 = {1, 2, 1};
        System.out.println(solutionContainerWithMostWater.maxArea(test40)); //2
        System.out.println("------------");
        int[] test43 = {76, 155, 15, 188, 180, 154, 84, 34, 187, 142, 22, 5, 27, 183, 111, 128, 50, 58, 2, 112, 179, 2, 100, 111, 115, 76, 134, 120, 118, 103, 31, 146, 58, 198, 134, 38, 104, 170, 25, 92, 112, 199, 49, 140, 135, 160, 20, 185, 171, 23, 98, 150, 177, 198, 61, 92, 26, 147, 164, 144, 51, 196, 42, 109, 194, 177, 100, 99, 99, 125, 143, 12, 76, 192, 152, 11, 152, 124, 197, 123, 147, 95, 73, 124, 45, 86, 168, 24, 34, 133, 120, 85, 81, 163, 146, 75, 92, 198, 126, 191};
        System.out.println(solutionContainerWithMostWater.maxArea(test43)); //18048
//        time
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("----Time----");
        System.out.println("Time spent, ms: " + elapsed);
    }
}

//time limit exception
class SolutionContainerWithMostWaterVer1 {
    public int maxArea(int[] height) {
        int heightLength = height.length;
        if (heightLength < 2 || heightLength > Math.pow(10, 5)) {
            return 0;
        }
        int containerSize = 0;
        for (int i = 0; i < heightLength; i++) {
            int leftContainerSize = i - 1;
            int rightContainerSize = i + 1;
            int currentContainerHeight = height[i];
            if (height[i] < 0 || height[i] > Math.pow(10, 4)) {
                return 0;
            }
//            left current container
            int leftCount = 0;
            int currentLeftHeight;
            for (int j = leftContainerSize; j > -1; j--) {
                if (currentContainerHeight <= height[j]) {
                    leftCount = i - j;
                }
            }
            currentLeftHeight = currentContainerHeight * leftCount;
//            right current container
            int rightCount = 0;
            int currentRightHeight;
            for (int j = rightContainerSize; j < heightLength; j++) {
                if (currentContainerHeight <= height[j]) {
                    rightCount = j - i;
                }
            }
            currentRightHeight = currentContainerHeight * rightCount;
//            max result
            if (currentLeftHeight >= currentRightHeight && currentLeftHeight > containerSize) {
                containerSize = currentLeftHeight;
            } else {
                if (currentRightHeight > containerSize) {
                    containerSize = currentRightHeight;
                }
            }
        }
        return containerSize;
    }
}

//this is still a time limit exception
class SolutionContainerWithMostWaterVer2 {
    public int maxArea(int[] height) {
        int heightLength = height.length;
//        Constraints
        if (heightLength < 2 || heightLength > Math.pow(10, 5)) {
            return 0;
        }
        List<Integer> heightList = Arrays.stream(height).boxed().collect(Collectors.toList());
        int containerSize = 0;
        height = Arrays.stream(height).sorted().toArray();
        int count;
//        Constraints max element
        if (height[heightLength - 1] > Math.pow(10, 4)) {
            return 0;
        }
        int lastElementIndex;
        int lastElementLastIndex;
        int previousElementIndex;
        int previousElementLastIndex;
        ArrayList<Integer> testInt = new ArrayList<>();
        List<List<Integer>> alreadyTestInt = new ArrayList<>();
        for (int i = heightLength - 1; i > 0; i--) {
            count = 0;
            while (i - count > 0) {
//            Constraints min element
                if (height[i] < 0) {
                    return 0;
                }
                int currentLastElement = height[i];
                int currentPreviousElement = height[i - 1 - count];
                testInt.add(currentLastElement);
                testInt.add(currentPreviousElement);
                if (alreadyTestInt.contains(testInt)) {
                    count++;
                    continue;
                } else {
                    alreadyTestInt.add((ArrayList) testInt.clone());
                    testInt.clear();
                }
                lastElementIndex = heightList.indexOf(currentLastElement);
                lastElementLastIndex = heightList.lastIndexOf(currentLastElement);
                previousElementIndex = heightList.indexOf(currentPreviousElement);
                previousElementLastIndex = heightList.lastIndexOf(currentPreviousElement);
                int maxCurrentHeightOne = Math.abs(lastElementIndex - previousElementLastIndex) * currentPreviousElement;
                int maxCurrentHeightTwo = Math.abs(lastElementLastIndex - previousElementIndex) * currentPreviousElement;
                if (maxCurrentHeightOne >= maxCurrentHeightTwo && maxCurrentHeightOne > containerSize) {
                    containerSize = maxCurrentHeightOne;
                } else {
                    if (maxCurrentHeightTwo > containerSize) {
                        containerSize = maxCurrentHeightTwo;
                    }
                }
                count++;
            }
        }
        return containerSize;
    }
}

// version2 update
class SolutionContainerWithMostWater {
    public int maxArea(int[] height) {
        int heightLength = height.length;
//        Constraints
        if (heightLength < 2 || heightLength > Math.pow(10, 5)) {
            return 0;
        }
        List<Integer> heightList = Arrays.stream(height).boxed().collect(Collectors.toList());
        int containerSize = 0;
        height = Arrays.stream(height).sorted().toArray();
        int count;
//        Constraints max and min element
        if (height[heightLength - 1] > Math.pow(10, 4) || height[0] < 0) {
            return 0;
        }
        int lastElementIndex;
        int lastElementLastIndex;
        int previousElementIndex;
        int previousElementLastIndex;
//        ArrayList<Integer> testInt = new ArrayList<>();
//        List<List<Integer>> alreadyTestInt = new ArrayList<>();
        for (int i = heightLength - 1; i > 0; i--) {
            count = 0;
            while (i - count > 0) {
                int currentLastElement = height[i];
//                testing current max container size
                if (currentLastElement * (heightLength - 1) <= containerSize) {
                    return containerSize;
                }
                int currentPreviousElement = height[i - 1 - count];
//                testInt.add(currentLastElement);
//                testInt.add(currentPreviousElement);
//                if (alreadyTestInt.contains(testInt)) {
//                    count++;
//                    continue;
//                } else {
//                    alreadyTestInt.add((ArrayList) testInt.clone());
//                    testInt.clear();
//                }
                lastElementIndex = heightList.indexOf(currentLastElement);
                lastElementLastIndex = heightList.lastIndexOf(currentLastElement);
                previousElementIndex = heightList.indexOf(currentPreviousElement);
                previousElementLastIndex = heightList.lastIndexOf(currentPreviousElement);
                int maxCurrentHeightOne = Math.abs(lastElementIndex - previousElementLastIndex) * currentPreviousElement;
                int maxCurrentHeightTwo = Math.abs(lastElementLastIndex - previousElementIndex) * currentPreviousElement;
                if (maxCurrentHeightOne >= maxCurrentHeightTwo && maxCurrentHeightOne > containerSize) {
                    containerSize = maxCurrentHeightOne;
                } else {
                    if (maxCurrentHeightTwo > containerSize) {
                        containerSize = maxCurrentHeightTwo;
                    }
                }
                count++;
            }
        }
        return containerSize;
    }
}
