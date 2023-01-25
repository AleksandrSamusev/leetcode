//leetCode 136. Single number

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {7, 7, 6, 10, 6, 5, 5, 8, 8, 9, 9, 11, 11};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        var result = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if(nums[0] != nums[1]) {
            result = nums[0];
        }
        for(int i = 1; i<nums.length-2; i++) {
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) {
                result = nums[i];
            }
        }
        if(nums[nums.length-1] != nums[nums.length-2]) {
            result = nums[nums.length-1];
        }
        return result;
    }
}
