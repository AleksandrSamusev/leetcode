//125. Valid Palindrome

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
            } else if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}
