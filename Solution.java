//2089. Find Target Indices After Sorting Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 5, 2, 1, 1, 1, 1, 1};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
