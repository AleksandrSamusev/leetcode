//169. Majority Element

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int currentValue = 0;
        int target = nums.length / 2;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                currentValue = nums[i];
            } else {
                count++;
                if (count > target) {
                    return currentValue;
                } else {
                    count = 0;
                    currentValue = 0;
                }
            }
        }
        return currentValue;
    }
}
