package groupId;

public class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        if (nums.length > 3 * Math.pow(10, 4) || nums.length == 0) {
            return 0;
        }
        int[] ints = new int[nums.length];
        ints[0] = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                ints[count] = nums[i + 1];
                count++;
            }
        }
        System.arraycopy(ints, 0, nums, 0, nums.length);
        return count;
    }
}
