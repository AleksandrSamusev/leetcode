//217_contains_duplicate
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
