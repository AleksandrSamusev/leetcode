//34. Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        int mid;

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[left] == target) {
                index = left;
                break;
            } else if (nums[right] == target) {
                index = right;
                break;
            } else if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        if (index == -1) {
            return new int[]{-1, -1};
        }
        return new int[]{findLeft(nums, target, index), findRight(nums, target, index)};
    }

    public static int findLeft(int[] nums, int target, int index) {
        if (nums[0] == target) {
            return 0;
        }
        while (nums[index] == target && index != 0) {
            index--;
        }
        return index + 1;
    }

    public static int findRight(int[] nums, int target, int index) {
        if (nums[nums.length - 1] == target) {
            return nums.length - 1;
        }
        while (nums[index] == target && index != nums.length - 1) {
            index++;
        }
        return index - 1;
    }

}
