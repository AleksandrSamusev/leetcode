//540. Single Element in a Sorted Array

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] <= nums[nums.length - 2]) {
                if (nums[i] != nums[i - 1]) {
                    return nums[i - 1];
                }
            }
        }
        return 0;
    }
}
