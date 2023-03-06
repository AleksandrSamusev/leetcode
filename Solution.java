//1122. Relative Sort Array

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31};
        int[] arr2 = {2, 42, 38, 0, 43, 21};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }

        int[] result = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr2.length; i++) {
            int temp = count[arr2[i]];
            while (temp > 0) {
                result[index] = arr2[i];
                temp--;
                index++;
            }
            count[arr2[i]] = 0;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                int temp = count[i];
                while (temp > 0) {
                    result[index] = i;
                    if (index == arr1.length - 1) {
                        break;
                    }
                    index++;
                    temp--;
                }
            }
        }
        return result;
    }
}
