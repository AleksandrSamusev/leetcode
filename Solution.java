//283. Move Zeroes

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {//        1,1,1,1,0,4,6,5 index =4
        int[] nums = {1};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        boolean hasZero = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                index = i;
                hasZero = true;
                break;
            }
        }
        if (hasZero) {
            for (int i = index; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
