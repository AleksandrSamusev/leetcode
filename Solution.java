//1260. Shift 2D Grid

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[][] grid = {{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
        int k = 4;
        System.out.println(shiftGrid(grid, k));
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int[] lastColumn = new int[m];
        while (k > 0) {
            k--;
            for (int i = 0; i < lastColumn.length; i++) {
                lastColumn[i] = grid[i][n - 1];
            }
            for (int i = 0; i < m; i++) {
                for (int j = n - 1; j > 0; j--) {
                    grid[i][j] = grid[i][j - 1];
                }
            }
            grid[0][0] = lastColumn[lastColumn.length - 1];

            for (int i = 1; i < m; i++) {
                grid[i][0] = lastColumn[i - 1];
            }
        }
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(grid[i][j]);
            }
            result.add(temp);
        }
        return result;
    }
}
