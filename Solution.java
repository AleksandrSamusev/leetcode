//1266. Minimum Time Visiting All Points

public class Solution {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 1; i < points.length; i++) {
            int[] curr = points[i];
            int[] prev = points[i - 1];
            ans += Math.max(Math.abs(curr[0] - prev[0]), Math.abs(curr[1] - prev[1]));
        }
        return ans;
    }
}
