//1539. Kth Missing Positive Number

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 2;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int[] array = new int[2000];
        int num = 1;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            num++;
        }
        if (arr.length == arr[arr.length - 1]) {
            return array[arr.length + k - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            array[arr[i] - 1] = 0;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                counter++;
            }
            if (counter == k) {
                return array[i];
            }
        }
        return 0;
    }
}
