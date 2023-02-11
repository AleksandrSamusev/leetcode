//345. Reverse Vowels of a String

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117
                    || ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85) {
                sb.append(ch);
            }
        }
        sb.reverse();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 97 || chars[i] == 101 || chars[i] == 105 || chars[i] == 111 || chars[i] == 117
                    || chars[i] == 65 || chars[i] == 69 || chars[i] == 73
                    || chars[i] == 79 || chars[i] == 85) {
                chars[i] = sb.charAt(0);
                sb.deleteCharAt(0);
            }
        }
        return new String(chars);
    }
}
