//1011. Capacity To Ship Packages Within D Days

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 1, 1};
        int days = 4;
        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {

        int minCap = Arrays.stream(weights).max().getAsInt();                            // 8
        int maxCap = Arrays.stream(weights).reduce(0, Integer::sum);           // 36
        if (days == 1) {
            return maxCap;
        }
        int mid;
        int min = minCap;
        int max = maxCap;

        while (min <= max) {
            if (checkIfPassed(min, weights, days)) {
                return min;
            }
            if (checkIfPassed(max, weights, days) && !checkIfPassed(max - 1, weights, days)) {
                return max;
            }
            mid = (min + max) / 2;
            if (checkIfPassed(mid, weights, days) && !checkIfPassed(mid - 1, weights, days)) {
                return mid;
            } else if (checkIfPassed(mid, weights, days)) {
                max = mid;
            } else if (!checkIfPassed(mid, weights, days)) {
                min = mid;
            }
        }
        return 0;
    }


    public static boolean checkIfPassed(int capacity, int[] weights, int days) {
        int day = 1;
        int currentWeight = 0;
        for (Integer weight : weights) {
            currentWeight += weight;
            if (currentWeight > capacity) {
                day++;
                currentWeight = weight;
                if (day > days) {
                    return false;
                }
            }
        }
        return day <= days;
    }
}
