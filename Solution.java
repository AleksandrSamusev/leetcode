//392. Is Subsequence

public class Solution {
    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "aaaaaa";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int index_t = 0;
        int count_s = 0;
        int count_t = 0;

        for (int i = 0; i < s.length(); i++) {
            count_s++;
            for (int j = index_t; j < t.length(); j++) {
                if (index_t > t.length() - 1 && i < s.length() - 1) {
                    return false;
                }
                if (s.charAt(i) == t.charAt(j)) {
                    count_t++;
                    index_t = j + 1;
                    break;
                }
            }
        }
        return count_t == count_s;
    }
}
