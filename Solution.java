//2215. Find the Difference of Two Arrays

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int[] nums1Array = new int[2001];
        int[] nums2Array = new int[2001];
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > 0) {
                nums1Array[nums1[i] + 1000]++;
            } else {
                nums1Array[Math.abs(nums1[i])]++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] > 0) {
                nums2Array[nums2[i] + 1000]++;
            } else {
                nums2Array[Math.abs(nums2[i])]++;
            }
        }
        for (Integer num : nums1) {
            if (num > 0) {
                if (nums2Array[num + 1000] == 0) {
                    if (!list1.contains(num)) {
                        list1.add(num);
                    }
                }
            } else {
                if (nums2Array[Math.abs(num)] == 0) {
                    if (!list1.contains(num)) {
                        list1.add(num);
                    }
                }
            }
        }

        for (Integer num : nums2) {
            if (num > 0) {

                if (nums1Array[num + 1000] == 0) {
                    if (!list2.contains(num)) {
                        list2.add(num);
                    }
                }
            } else {
                if (nums1Array[Math.abs(num)] == 0) {
                    if (!list2.contains(num)) {
                        list2.add(num);
                    }
                }
            }
        }
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(list1);
        listOfLists.add(list2);
        return listOfLists;
    }
}
