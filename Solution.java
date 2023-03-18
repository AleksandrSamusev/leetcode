//1221. Split a String in Balanced Strings

public class Solution {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int r = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                r++;
            } else if (s.charAt(i) == 'L') {
                l++;
            }
            if (l == r) {
                count++;
                l = 0;
                r = 0;
            }
        }
        return count;
    }
}
