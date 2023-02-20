//35. Search Insert Position

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums[0] > target || nums[0] == target) {
            return 0;
        } else if (nums[0] < target && nums.length == 1) {
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target < nums[i]) {
                return i;
            } else if (target > nums[nums.length - 1]) {
                return nums.length;
            }
        }
        return 0;
    }
}
