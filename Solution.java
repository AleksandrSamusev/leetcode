///2405. Optimal Partition of String

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {
        int[] array = new int[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (array[s.charAt(i) - 'a'] != 0) {
                count++;
                Arrays.fill(array, 0);
                i--;
            } else if (array[s.charAt(i) - 'a'] == 0) {
                array[s.charAt(i) - 'a']++;
            }
        }
        count++;
        return count;
    }
}
