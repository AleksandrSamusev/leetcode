//896. Monotonic Array

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {

        int decreaseOrEqual = 0;
        int increaseOrEqual = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                decreaseOrEqual++;
            } else if (nums[i - 1] < nums[i]) {
                increaseOrEqual++;
            } else {
                decreaseOrEqual++;
                increaseOrEqual++;
            }
        }
        return decreaseOrEqual == nums.length - 1 || increaseOrEqual == nums.length - 1;
    }
}
