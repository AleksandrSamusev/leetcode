//1332. Remove Palindromic Subsequences

public class Solution {
    public static void main(String[] args) {
        String s = "baabb";
        System.out.println(removePalindromeSub(s));
    }

    public static int removePalindromeSub(String s) {
        int count = 0;
        int start = 0;
        int end = s.length();
        while (start < s.length()) {
            if (isPalindrome(s.substring(start, end))) {
                count++;
                start = end;
                end = s.length();
            } else {
                end--;
            }
        }
        return Math.min(count, 2);
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
}
