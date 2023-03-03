//2529. Maximum Count of Positive Integer and Negative Integer

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-2, -2, -1};
        System.out.println(maximumCount(nums));
    }

    public static int maximumCount(int[] nums) {
        int indexNegative;
        int firstPositive;

        if (nums[0] == 0 && nums[nums.length - 1] == 0) {
            return 0;
        }

        if (nums[0] > 0 || nums[nums.length - 1] < 0) {
            return nums.length;
        }


        if ((findLastNegative(nums)) == 0 && nums[0] >= 0) {
            if (nums[0] != 0) {
                return nums.length;
            } else {
                firstPositive = findFirstPositive(nums);
                return nums.length - firstPositive;
            }
        }
        if (findFirstPositive(nums) == 0 && nums[0] <= 0) {
            if (nums[nums.length - 1] != 0) {
                return nums.length;
            } else {
                return findLastNegative(nums) + 1;
            }
        }


        indexNegative = findLastNegative(nums);
        firstPositive = findFirstPositive(nums);

        if (indexNegative == 0 && firstPositive == 0) {
            return 0;
        }
        return Math.max(indexNegative + 1, nums.length - firstPositive);
    }

    public static int findLastNegative(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] < 0 && nums[mid + 1] >= 0) {
                return mid;
            }

            if (nums[mid] < 0) {
                left = mid;
            } else if (nums[mid] >= 0) {
                right = mid;
            }
        }
        return mid;
    }

    public static int findFirstPositive(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > 0 && nums[mid - 1] <= 0) {
                return mid;
            }

            if (nums[mid] <= 0) {
                left = mid;
            } else if (nums[mid] > 0) {
                right = mid;
            }
        }
        return mid;
    }
}
