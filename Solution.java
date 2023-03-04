//1011. Capacity To Ship Packages Within D Days

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8};
        int days = 2;
        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {

        int minCap = Arrays.stream(weights).max().getAsInt();                            // 8
        int maxCap = Arrays.stream(weights).reduce(0, Integer::sum);           // 36
        if (days == 1) {
            return maxCap;
        }
        for (int i = minCap; i <= maxCap; i++) {
            if (checkIfPassed(i, weights, days)) {
                return i;
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
