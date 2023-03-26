//1365. How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);
        int[] result = new int[nums.length];

        if (nums.length == 1) {
            return new int[]{0};
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = findFirstOccurrence(sortedArray, nums[i]);
        }
        return result;
    }

    public static int findFirstOccurrence(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (num > array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
