//3. Longest Substring Without Repeating Characters

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int i = 0;
        int j = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (j < s.length()) {

            if (set.contains(s.charAt(j))) {
                while (set.contains(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(s.charAt(j));
            if (set.size() > max) {
                max = set.size();
            }
            j++;
        }
        return max;
    }
}
