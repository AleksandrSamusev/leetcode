//1299. Replace Elements with Greatest Element on Right Side

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {
        int max = findMax(arr, 0);
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                arr[i] = max;
            } else {
                max = findMax(arr, i + 1);
                arr[i] = max;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public static int findMax(int[] arr, int startIndex) {
        int max = 0;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
