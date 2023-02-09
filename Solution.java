//121. Best Time to Buy and Sell Stock

public class Solution {
    public static void main(String[] args) {
        int[] prices = {3, 2, 6, 5, 0};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxDiff = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            maxDiff = Math.max(maxDiff, prices[i] - minPrice);
        }
        return maxDiff;
    }
}
