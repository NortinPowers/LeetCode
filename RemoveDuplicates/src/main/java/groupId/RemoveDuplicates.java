package groupId;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicatesSolution removeDuplicatesSolution = new RemoveDuplicatesSolution();
        int[] ints = {0, 0, 1, 1, 2, 2, 2, 2, 4, 5};
        System.out.println(removeDuplicatesSolution.removeDuplicates(ints));
        System.out.println(Arrays.toString(ints));

    }
}
