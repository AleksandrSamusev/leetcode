//1480. Running Sum of 1d Array

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return new int[]{0};
        }
        if (nums.length == 1) {
            return new int[]{nums[0]};
        }
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i] + result[i - 1];
        }
        return result;
    }
}
