//922. Sort Array By Parity II

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {888, 505, 627, 846};                                                    //[888,505,846,627]
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[even] = nums[i];
                even += 2;
            } else {
                result[odd] = nums[i];
                odd += 2;
            }
        }
        return result;
    }
}
