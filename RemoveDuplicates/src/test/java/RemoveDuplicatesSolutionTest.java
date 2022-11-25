import groupId.RemoveDuplicatesSolution;
import org.junit.jupiter.api.Assertions;

class RemoveDuplicatesSolutionTest {

    @org.junit.jupiter.api.Test
    void removeDuplicates() {
        RemoveDuplicatesSolution removeDuplicatesSolution = new RemoveDuplicatesSolution();
        Assertions.assertEquals(5, removeDuplicatesSolution.removeDuplicates(new int[]{0, 0, 1, 1, 2, 2, 2, 2, 4, 5}));
        Assertions.assertEquals(2, removeDuplicatesSolution.removeDuplicates(new int[]{1, 1, 2}));
        Assertions.assertEquals(5, removeDuplicatesSolution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        Assertions.assertEquals(0, removeDuplicatesSolution.removeDuplicates(new int[]{}));
    }
}