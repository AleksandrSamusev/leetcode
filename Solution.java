//680. Valid Palindrome II

public class Solution {
    public static void main(String[] args) {
        String s = "ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        for (int i = 0; i < (s.length() / 2); i++) {
            if (s.charAt(i) != (s.charAt(s.length() - 1 - i))) {
                String one = s.substring(i, s.length() - i - 1);
                String two = s.substring(i + 1, s.length() - i);
                StringBuilder sb1 = new StringBuilder(one);
                StringBuilder sb2 = new StringBuilder(two);
                sb1.reverse();
                sb2.reverse();
                if (one.equals(sb1.toString()) || two.equals(sb2.toString())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
