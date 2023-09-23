import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int n = 3;
        System.out.println(Arrays.toString(calculate(nums, n)));
    }

    private static int[] calculate(int[] nums, int n) {
        if (n == 1) {
            return nums;
        }
        int[] arr = new int[nums.length];
        for (int i = 0, j = 0; i < n; i++, j += 2) {
            arr[j] = nums[i];
            arr[j + 1] = nums[i + n];
        }
        return arr;
    }
}
