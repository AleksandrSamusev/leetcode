//1252. Cells with Odd Values in a Matrix

public class Solution {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] indices = {{1, 1}, {0, 0}};
        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int rows, int cols, int[][] indices) {
        int[][] matrix = new int[rows][cols];
        int oddCounter = 0;
        for (int[] array : indices) {
            int rowToIncrease = array[0];
            int columnToIncrease = array[1];

            for (int i = 0; i < cols; i++) {
                matrix[rowToIncrease][i]++;
            }
            for (int i = 0; i < rows; i++) {
                matrix[i][columnToIncrease]++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCounter++;
                }
            }
        }
        return oddCounter;
    }
}
