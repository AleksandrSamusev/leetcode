//1217. Minimum Cost to Move Chips to The Same Position

public class Solution {
    public static void main(String[] args) {
        int[] position = {2, 2, 2, 2, 3, 3, 3, 3};
        System.out.println(minCostToMoveChips(position));
    }

    public static int minCostToMoveChips(int[] position) {
        int[] result = new int[2];
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        return Math.min(result[0], result[1]);
    }
}
