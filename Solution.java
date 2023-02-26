//448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        int[] nums = {10, 2, 5, 10, 9, 1, 1, 4, 3, 7};  // 1,1,2,3,4,5,7,9,10,10
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer number : nums) {
            set.add(number);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            list.add(i);
        }
        list.removeAll(set);
        return list;
    }
}
