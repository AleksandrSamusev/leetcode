//2529. Maximum Count of Positive Integer and Negative Integer

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-3, -2, 0, 1, 1, 1, 2};
        System.out.println(maximumCount(nums));
    }

    public static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (Integer num : nums) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}
