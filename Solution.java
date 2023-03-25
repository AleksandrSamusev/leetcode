//414. Third Maximum Number

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int initMax = nums[nums.length - 1];
        int count = 1;
        int max;
        if (nums.length <= 2) {
            return nums[nums.length - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                max = nums[i];
                count++;
                if (count == 3) {
                    return max;
                }
            }
        }
        return initMax;
    }
}
