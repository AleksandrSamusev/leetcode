//961. N-Repeated Element in Size 2N Array

public class Solution {
    public static void main(String[] args) {
        int[] nums = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedNTimes(nums));
    }

    public static int repeatedNTimes(int[] nums) {
        int[] arr = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] == nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
