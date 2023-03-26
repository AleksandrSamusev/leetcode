//724. Find Pivot Index

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int index = -1;
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = nums[0];
        rightSum[rightSum.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i] + leftSum[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = nums[i] + rightSum[i + 1];
        }
        for (int i = 0; i < leftSum.length; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return index;
    }
}
