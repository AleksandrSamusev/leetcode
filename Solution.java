//821. Shortest Distance to a Character

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "zzze";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = theClosestChar(s, i, c);
        }
        return array;
    }

    public static int theClosestChar(String s, int currentIndex, char target) {
        int indexesLeft = 0;
        int indexesRight = 0;
        if (s.charAt(currentIndex) == target) {
            return 0;
        }
        if (currentIndex != 0 || currentIndex == s.length() - 1) {
            for (int i = currentIndex; i >= 0; i--) {
                if (s.charAt(i) == target) {
                    indexesLeft = Math.abs(i - currentIndex);
                    break;
                }
            }
        }
        if (currentIndex == 0 || currentIndex != s.length() - 1) {
            for (int i = currentIndex; i < s.length(); i++) {
                if (s.charAt(i) == target) {
                    indexesRight = Math.abs(i - currentIndex);
                    break;
                }
            }
        }
        if (indexesLeft == 0) {
            return indexesRight;
        } else if (indexesRight == 0) {
            return indexesLeft;
        }
        return Integer.min(indexesLeft, indexesRight);
    }
}
