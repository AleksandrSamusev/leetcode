//2089. Find Target Indices After Sorting Array

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 5, 2, 1, 1, 1, 1, 1};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        int equal = 0;
        int less = 0;
        List<Integer> list = new ArrayList<>();
        for (Integer num : nums) {
            if (num == target) {
                equal++;
            }
            if (num < target) {
                less++;
            }
        }
        for (int i = less; i < less + equal; i++) {
            list.add(i);
        }

        return list;
    }
}
