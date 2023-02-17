//905. Sort Array By Parity

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 1, 1, 1, 6, 8, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int pasteIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[pasteIndex];
                nums[pasteIndex] = nums[i];
                nums[i] = temp;
                pasteIndex++;
            }
        }
        return nums;
    }
}
