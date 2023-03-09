//1207. Unique Number of Occurrences

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(nums));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        int[] array = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                array[Math.abs(arr[i])]++;
            } else {
                array[arr[i] + 1000]++;
            }
        }
        Arrays.sort(array);
        for (int j = 1; j < array.length; j++) {
            if (array[j] != 0) {
                if (array[j] == array[j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
