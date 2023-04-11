//2120. Execution of All Suffix Instructions Staying in a Grid

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        int[] startPos = {0, 1};
        String s = "RRDDLU";
        System.out.println(Arrays.toString(executeInstructions(n, startPos, s)));
    }

    public static int[] executeInstructions(int n, int[] startPos, String s) {
        if (n == 1) {
            return new int[s.length()];
        }
        int[] result = new int[s.length()];
        int[] newPos;

        for (int i = 0; i < s.length(); i++) {
            newPos = Arrays.copyOf(startPos, startPos.length);
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'R' && newPos[1] < n - 1) {
                    result[i]++;
                    newPos[1]++;
                } else if (s.charAt(j) == 'L' && newPos[1] > 0) {
                    result[i]++;
                    newPos[1]--;
                } else if (s.charAt(j) == 'U' && newPos[0] > 0) {
                    result[i]++;
                    newPos[0]--;
                } else if (s.charAt(j) == 'D' && newPos[0] < n - 1) {
                    result[i]++;
                    newPos[0]++;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
