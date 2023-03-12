//1619. Mean of Array After Removing Some Elements

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4};
        System.out.println(trimMean(arr));
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int startIndex = arr.length / 20;
        int endIndex = arr.length - 1 - arr.length / 20;
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += arr[i];
        }
        return (double) sum / (arr.length - startIndex * 2);
    }
}
