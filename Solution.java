//1331. Rank Transform of an Array

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};   // {5, 9, 12, 12, 28, 37, 56, 80, 100}
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();
        int value = 1;
        for (int i = 0; i < temp.length; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], value);
                value++;
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}
