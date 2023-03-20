//495. Teemo Attacking

public class Solution {
    public static void main(String[] args) {
        int[] timeSeries = {1, 2, 3, 4, 5};
        int duration = 5;
        System.out.println(findPoisonedDuration(timeSeries, duration));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] - timeSeries[i - 1] >= duration) {
                result += duration;
            } else {
                result += timeSeries[i] - timeSeries[i - 1];
            }
        }
        result += duration;
        return result;
    }
}
