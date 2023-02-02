//496. Next Greater Element I

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {137, 59, 92, 122, 52, 131, 79, 236};
        int[] nums2 = {137, 59, 92, 122, 52, 131, 79, 236};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == value) {
                    int temp = -1;
                    for (int k = j; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            temp = nums2[k];
                            break;
                        }
                    }
                    list.add(temp);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

