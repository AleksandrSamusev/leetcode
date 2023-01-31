//268. Missing Number

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer value : nums) {
            set.add(value);
        }

        if (!set.contains(nums.length)) {
            result = nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i)) {
                result = i;
            }
        }
        return result;
    }
}
