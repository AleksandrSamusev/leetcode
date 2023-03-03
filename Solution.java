//747. Largest Number At Least Twice of Others

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int[] array = Arrays.copyOf(nums, nums.length);
        Arrays.sort(array);
        int max = array[array.length - 1];
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                index = i;
            } else if (nums[i] * 2 > max) {
                return -1;
            }
        }
        return index;
    }
}
