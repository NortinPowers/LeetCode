package problem.number_1;

import junit.framework.TestCase;
import org.junit.Assert;

public class SolutionTwoSumTest extends TestCase {

    public void testTwoSum() {
        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        int[] expectedResult;
        int[] actualResult;
        expectedResult = new int[]{1, 3};
        actualResult = solutionTwoSum.twoSum(new int[]{1, 3, 2, 3}, 6);
        Assert.assertArrayEquals(expectedResult, actualResult);
        expectedResult = new int[]{0, 1};
        actualResult = solutionTwoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertArrayEquals(expectedResult, actualResult);
        expectedResult = new int[]{1, 2};
        actualResult = solutionTwoSum.twoSum(new int[]{3, 2, 4}, 6);
        Assert.assertArrayEquals(expectedResult, actualResult);
        expectedResult = new int[]{0, 1};
        actualResult = solutionTwoSum.twoSum(new int[]{3, 3}, 6);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}