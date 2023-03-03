//704. Binary Search


public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 8, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left != right) {
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }

            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (nums[mid] == target) {
            return mid;
        }
        return -1;
    }
}
