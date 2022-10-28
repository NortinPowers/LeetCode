package ContainerWithMostWater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainerWithMostWater {
    public static void main(String[] args) {
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
