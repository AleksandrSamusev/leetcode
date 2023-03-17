//63_Unique_paths_II

public class Solution {
    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        boolean flag = false;

        for (int i = 0; i < cols; i++) {
            if (flag || obstacleGrid[0][i] == 1) {
                dp[0][i] = 0;
                flag = true;
            } else {
                dp[0][i] = 1;
            }
        }
        flag = false;
        for (int i = 0; i < rows; i++) {
            if (flag || obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
                flag = true;
            } else {
                dp[i][0] = 1;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[rows - 1][cols - 1];
    }
}
