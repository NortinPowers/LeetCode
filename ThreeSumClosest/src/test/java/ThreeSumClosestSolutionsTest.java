import groupId.ThreeSumClosestSolutions;
import org.junit.jupiter.api.Assertions;

class ThreeSumClosestSolutionsTest {

    @org.junit.jupiter.api.Test
    void threeSumClosest() {
        ThreeSumClosestSolutions threeSumClosestSolutions = new ThreeSumClosestSolutions();
        Assertions.assertEquals(0, threeSumClosestSolutions.threeSumClosest(new int[]{0, 0, 0}, 1));
        Assertions.assertEquals(2, threeSumClosestSolutions.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        Assertions.assertEquals(2, threeSumClosestSolutions.threeSumClosest(new int[]{0, 2, 0, 0}, 3));
        Assertions.assertEquals(1, threeSumClosestSolutions.threeSumClosest(new int[]{-1, 2, 0, -4, 5}, 1));
    }
}