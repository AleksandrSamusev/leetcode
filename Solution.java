//1128_Equivalent_of_number_domino_pairs

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[][] dominoes = {{1, 1}, {2, 2}, {1, 1}, {1, 2}, {1, 2}, {1, 1}};
        System.out.println(numEquivDominoPairs(dominoes));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++) {
            if (!map.containsKey(pairAsString(dominoes[i])) && !map.containsKey(reversedPairAsString(dominoes[i]))) {
                map.put(pairAsString(dominoes[i]), 1);
            } else if (map.containsKey(pairAsString(dominoes[i])) && !map.containsKey(reversedPairAsString(dominoes[i]))) {
                int value = map.get(pairAsString(dominoes[i]));
                value++;
                map.put(pairAsString(dominoes[i]), value);
            } else if (map.containsKey(reversedPairAsString(dominoes[i])) && !map.containsKey(pairAsString(dominoes[i]))) {
                int value = map.get(reversedPairAsString(dominoes[i]));
                value++;
                map.put(reversedPairAsString(dominoes[i]), value);
            } else if (map.containsKey(pairAsString(dominoes[i])) && pairAsString(dominoes[i]).equals(reversedPairAsString(dominoes[i]))) {
                int value = map.get(pairAsString(dominoes[i]));
                value++;
                map.put(pairAsString(dominoes[i]), value);
            }
        }

        int sum = 0;
        for (Integer value : map.values()) {
            if (value > 1) {
                sum += value * (value - 1) / 2;
            }
        }
        return sum;

    }

    public static String pairAsString(int[] arr) {
        return Arrays.toString(arr);
    }

    public static String reversedPairAsString(int[] arr) {
        int[] pair = new int[arr.length];
        int temp = arr[0];
        pair[0] = arr[1];
        pair[1] = temp;
        return Arrays.toString(pair);
    }
}
