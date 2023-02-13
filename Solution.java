//389. Find the Difference

public class Solution {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int[] alphabetChars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabetChars[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (alphabetChars[t.charAt(i) - 'a'] != 0) {
                alphabetChars[t.charAt(i) - 'a']--;
            } else if (alphabetChars[t.charAt(i) - 'a'] == 0) {
                return t.charAt(i);
            }
        }
        return 0;
    }
}
