//888. Fair Candy Swap

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 2, 5};
        int[] bobSizes = {2, 4};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotalCandies = sumArrayElements(aliceSizes);
        int bobTotalCandies = sumArrayElements(bobSizes);
        int diff = Math.abs(bobTotalCandies - aliceTotalCandies);
        int elDiff = diff / 2;

        int temp = 0;

        if (aliceSizes.length == 1) {
            if (sumArrayElements(aliceSizes) > sumArrayElements(bobSizes)) {
                for (int i = 0; i < bobSizes.length; i++) {
                    if (bobSizes[i] == aliceSizes[0] - elDiff) {
                        return new int[]{aliceSizes[0], bobSizes[i]};
                    }
                }
            } else {
                for (int i = 0; i < bobSizes.length; i++) {
                    if (bobSizes[i] == aliceSizes[0] + elDiff) {
                        return new int[]{aliceSizes[0], bobSizes[i]};
                    }
                }
            }
        }
        if (bobSizes.length == 1) {
            if (sumArrayElements(bobSizes) > sumArrayElements(aliceSizes)) {
                for (int i = 0; i < aliceSizes.length; i++) {
                    if (aliceSizes[i] == bobSizes[0] - elDiff) {
                        return new int[]{aliceSizes[i], bobSizes[0]};
                    }
                }
            } else {
                for (int i = 0; i < aliceSizes.length; i++) {
                    if (aliceSizes[i] == bobSizes[0] + elDiff) {
                        return new int[]{aliceSizes[i], bobSizes[0]};
                    }
                }
            }
        }


        if (aliceTotalCandies > bobTotalCandies) {
            for (int i = 0; i < aliceSizes.length; i++) {
                for (int j = 0; j < bobSizes.length; j++) {
                    if (bobSizes[j] == aliceSizes[i] - elDiff) {
                        return new int[]{aliceSizes[i], bobSizes[j]};
                    }
                }
            }
        } else {
            for (int i = 0; i < aliceSizes.length; i++) {
                for (int j = 0; j < bobSizes.length; j++) {
                    if (bobSizes[j] == aliceSizes[i] + elDiff) {
                        return new int[]{aliceSizes[i], bobSizes[j]};
                    }
                }
            }
        }
        return new int[]{aliceSizes[temp], bobSizes[temp]};
    }

    public static int sumArrayElements(int[] array) {
        int sum = 0;
        for (Integer num : array) {
            sum += num;
        }
        return sum;
    }
}
